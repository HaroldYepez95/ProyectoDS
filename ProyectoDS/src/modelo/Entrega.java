/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Harold
 */
public class Entrega extends Operacion{
    private int idEntrega;
    private String localizacionQuiosco;
    private String Observacion;

    public Entrega(int idEntrega, String localizacionQuiosco, String Observacion, int idOperacion, int idVendedor, int idComprador, LocalDate fechaHora) {
        super(idOperacion, idVendedor, idComprador, fechaHora);
        this.idEntrega = idEntrega;
        this.localizacionQuiosco = localizacionQuiosco;
        this.Observacion = Observacion;
    }

    

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getLocalizacionQuiosco() {
        return localizacionQuiosco;
    }

    public void setLocalizacionQuiosco(String localizacionQuiosco) {
        this.localizacionQuiosco = localizacionQuiosco;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
    
}
