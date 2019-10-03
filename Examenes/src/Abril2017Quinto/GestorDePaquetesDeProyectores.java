/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2017Quinto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class GestorDePaquetesDeProyectores {
    private List <PaqueteProyectores> paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombre) {
        this.nombreEmpresa = nombre;
        paquetes = new ArrayList<> ();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }

    public void agregarPaquete(PaqueteProyectores paqueteNuevo){
        paquetes.add(paqueteNuevo);
    }
    
    public PaqueteProyectores buscarPaqueteDeProyectos(int codPaq){
        PaqueteProyectores paqueteEncontrado;
        for(Iterator <PaqueteProyectores> it= paquetes.iterator(); it.hasNext();){
            paqueteEncontrado = it.next();
            if(paqueteEncontrado.getCodPaqueteDeProyectores() == codPaq){
                return paqueteEncontrado;
            }
            }
        return null;
        }
    
    
    
}
