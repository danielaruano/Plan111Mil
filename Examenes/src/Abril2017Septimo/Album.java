/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2017Septimo;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Album {
    private List<Foto> fotos;
    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion;
    
    public Album(String nombre, int maximo){
        this.nombre= nombre;
        this.cantidadMaxima= maximo;
    }

    public Foto getFotos(int posicion) {
        return this.fotos.get(posicion);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
     public void addFoto(Foto foto){
         fotos.add(foto);
     }
     
     public boolean tieneFotoConTamañoMenor(int maximo){
         for(Iterator <Foto> it= fotos.iterator(); it.hasNext();){
             Foto f1= it.next();
             if(f1.getTamaño() < maximo){
             return true;
             }
         }
         return false;
     }
     
     public boolean pueba(int maximo){
         for(int i=0; i< fotos.size(); i++){
             if(this.getFotos(i).getTamaño() < maximo){
             return true;
             }
         }
         return false;
     }
     
    
}
