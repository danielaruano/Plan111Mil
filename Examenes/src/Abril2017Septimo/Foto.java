/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2017Septimo;

import java.util.logging.Logger;

/**
 *
 * @author capacitacion16
 */
public class Foto {
    private String [] personasEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripcion;
    
    public Foto(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public String getPersonasEnFoto(int pos){
        return personasEnFoto[pos];
    }
    
    public void setPersonaEnFoto(int pos, String persona){
        personasEnFoto[pos]= persona;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    
    
}
