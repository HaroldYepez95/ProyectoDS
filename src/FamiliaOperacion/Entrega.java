/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaOperacion;

/**
 *
 * @author Estudiante
 */
public class Entrega extends Operacion {

    private int idEntrega;
    private String localizacionQuiosco, observacion;

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
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
