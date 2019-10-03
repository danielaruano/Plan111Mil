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
public class Alumno {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    

   public boolean equals(Object o){
       Alumno a1= (Alumno) o;
       if(dni == a1.getDni() && nombre.equalsIgnoreCase(a1.getNombre())
               && apellido.equalsIgnoreCase(a1.getApellido()) && edad == a1.getEdad()){
           return true;
       }
       return false;
   }
    
}
