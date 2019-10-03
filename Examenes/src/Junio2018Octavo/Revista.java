/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junio2018Octavo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Revista {
    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;
    
    public Revista(String titulo, int ejemplar){
        this.titulo= titulo;
        this.ejemplar= ejemplar;
        elementos = new ArrayList<>();
    }
    
    public boolean addElemento(Articulo articulo){
        return this.addElemento(articulo);
    }
    
    public Articulo getArticuloEnPosicion(int posicion){
        //for(Iterator <Articulo> it= elementos.iterator(); it.hasNext();){
          //  Articulo a1= it.next();
            if(posicion > elementos.size() || posicion < 0){
                return null;
            }
        return elementos.get(posicion);
     }
    
    public int getCantidadDeArticulos(String tema){
        int cantidad= 0;
        for(Iterator <Articulo> it= elementos.iterator(); it.hasNext();){
            Articulo art= it.next();
            if(art.contieneTemas(tema)){
                cantidad ++;
            }
        }
        
        return cantidad;
             
    }
}

