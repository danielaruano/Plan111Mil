/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2016Sexto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Stock {
    private List<ItemStock> items;
    
    public Stock(){
        items = new ArrayList<>();
    }
    
    public List<ItemStock> getItems(){
        return this.items;
    }
    
    public void setItems(List<ItemStock> newItems){
        items.clear();
        this.items.addAll(newItems);
    }
    
    public List<ItemStock> consultarItemsFaltante(int cantidadMaxima){
        List<ItemStock> resultado = new ArrayList<>();
        for(Iterator <ItemStock> it= items.iterator(); it.hasNext();){
            ItemStock compu= it.next();
            if(compu.getCantidad() < cantidadMaxima){
                resultado.add(compu);
            }
        }
        
        return resultado;
    }
}
