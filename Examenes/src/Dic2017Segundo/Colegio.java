/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dic2017Segundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Colegio {
    private List <Curso> cursos;

    public Colegio() {
        cursos= new ArrayList <>();
    }
    
    // Dado un nombre de un curso por parámetro, obtener la cantidad de estudiantes en ese curso
    
    public int cantidadDeEstudiantesEnElCurso(String cursoBuscar){
        int cantidadAlumnos=0;
        for(Iterator <Curso> it= cursos.iterator(); it.hasNext();){
            Curso c1= it.next();
            if(cursoBuscar.equalsIgnoreCase(c1.getNombreCurso())){
                cantidadAlumnos = c1.getIncripciones().size();
            }
        }
        return cantidadAlumnos;
    }
    
    //Dado un nombre de un curso por parámetro, obtener la cantidad de estudiantes que 
    //aprobaron el examen con la nota de aprobación o más
    
    public int estudiantesAprobadosDelCurso(String cursoAprobado){
        int aprobados=0;
        Inscripcion ii= new Inscripcion();
        for(Iterator <Curso> it = cursos.iterator(); it.hasNext();){
            Curso cA= it.next();
            if(cursoAprobado.equalsIgnoreCase(cA.getNombreCurso()) && ii.getNota() >= cA.getNotaAprobacion()){
                aprobados ++;
            }
        }
        return aprobados;
    }


}
