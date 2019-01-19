/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Harold
 */
public class PagoElectronico implements Pago{
    private int idPagoElectronico;

    public PagoElectronico(int idPagoElectronico) {
        this.idPagoElectronico = idPagoElectronico;
    }

    public int getIdPagoElectronico() {
        return idPagoElectronico;
    }

    public void setIdPagoElectronico(int idPagoElectronico) {
        this.idPagoElectronico = idPagoElectronico;
    }

    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
