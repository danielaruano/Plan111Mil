/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dic2017Segundo;

import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List <Inscripcion> inscripciones;

    public Curso(float nota,int cupo,String nombre) {
        this.nombreCurso = nombre;
        this.cupo = cupo;
        this.notaAprobacion = nota;
    }

    public void setNombreCurso(String n) {
        this.nombreCurso = n;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public float getNotaAprobacion() {
        return notaAprobacion;
    }

    public List<Inscripcion> getIncripciones() {
        return inscripciones;
    }
    
    public void addInscripciones(Inscripcion i){
        inscripciones.add(i);
    }
    
    
    
    
}
