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
public class PaqueteProyectores {
    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProyectores(int codPaquete, String destinatario, String destino, float costoEnvio) {
        this.codPaqueteDeProyectores = codPaquete;
        this.destinatario = destinatario;
        this.destino= destino;
        this.costoEnvio = costoEnvio;
        this.enTransito = true;
    }

    public void setCodPaqueteDeProyectores(int cod) {
        this.codPaqueteDeProyectores = cod;
    }

    public int getCodPaqueteDeProyectores() {
        return codPaqueteDeProyectores;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    
    @Override
    public String toString(){
        return this.codPaqueteDeProyectores + " " + " " + this.destinatario + " " + this.destino + " " + this.costoEnvio;
    }
    
    
    
}
