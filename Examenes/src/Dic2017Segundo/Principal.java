/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dic2017Segundo;

/**
 *
 * @author capacitacion16
 */
public class Principal {
    public static void main(String[] args) {
        Alumno a1= new Alumno(25888969, "Pedro", "perez",25);
        Alumno a2= new Alumno(36887870, "ricardo", "lopez",30);
        Alumno a3=new Alumno(24565854, "maria", "castillos",19);
        Alumno a5= new Alumno(25888969, "pedro", "perez",25);
        
        Curso c1= new Curso(6, 10, "111Mil");
        Curso c2= new Curso(4, 8, "ingles");
        
        Colegio in1=new Colegio();
        
        Inscripcion i1= new Inscripcion();
        
        System.out.println(a1.equals(a2));
        System.out.println(a1.getApellido() + c1.getNombreCurso());
        System.out.println(in1.estudiantesAprobadosDelCurso("111Mil"));
        
        i1.setAlumno(a2);
        i1.setCurso(c1);
        
        System.out.println(in1.cantidadDeEstudiantesEnElCurso("111Mil"));
        
    }
}
