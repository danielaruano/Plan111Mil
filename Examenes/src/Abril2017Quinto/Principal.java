/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2017Quinto;

/**
 *
 * @author capacitacion16
 */
public class Principal {
    public static void main(String[] args) {
        PaqueteProyectores p1= new PaqueteProyectores(5,"111mil", "deheza", 50);
        GestorDePaquetesDeProyectores g1= new GestorDePaquetesDeProyectores("AAA");
        g1.agregarPaquete(p1);
        //System.out.println(p1);
        System.out.println(g1.buscarPaqueteDeProyectos(5));;
        p1.toString();
    }
    
}
