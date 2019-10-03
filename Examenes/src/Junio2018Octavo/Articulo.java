/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junio2018Octavo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion16
 */
public class Articulo {
    private String titulo;
    private String periodista;
    private List <String> temas;
    private int palabras;
    private String texto;
    private long idArticulo;

    public Articulo(String titulo, String periodista, int palabras, String texto, long idArticulo) {
        this.titulo = titulo;
        this.periodista = periodista;
        this.palabras = palabras;
        this.texto = texto;
        this.idArticulo = idArticulo;
        temas= new ArrayList<>();
    }
    
    public boolean addTema(String tema){
        return this.addTema(tema);
    }

    public String getPeriodista() {
        return periodista;
    }

    public void setPeriodista(String periodista) {
        this.periodista = periodista;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }
    
    public boolean contieneTemas(String tema){
        if(temas.contains(tema)){
            return true;
        }
        return false;
    }
    
    
}
