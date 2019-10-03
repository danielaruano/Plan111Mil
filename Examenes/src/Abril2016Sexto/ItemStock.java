/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abril2016Sexto;

import java.util.Date;

/**
 *
 * @author capacitacion16
 */
public class ItemStock {
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaPresentacion;
    
    public ItemStock(Computadora c, int cantidad){
        this.computadora= c;
        this.cantidad= cantidad;
    }
    
    public Computadora getComputadora(){
        return computadora;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
}
