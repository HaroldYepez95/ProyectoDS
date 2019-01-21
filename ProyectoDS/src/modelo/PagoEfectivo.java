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
public class PagoEfectivo implements Pago{
    private int idPagoEfectivo;
    private double valorEntregado;
    private double cambio;

    public PagoEfectivo(int idPagoEfectivo, double valorEntregado) {
        this.idPagoEfectivo = idPagoEfectivo;
        this.valorEntregado = valorEntregado;
    }

    public int getIdPagoEfectivo() {
        return idPagoEfectivo;
    }

    public void setIdPagoEfectivo(int idPagoEfectivo) {
        this.idPagoEfectivo = idPagoEfectivo;
    }

    public double getValorEntregado() {
        return valorEntregado;
    }

    public void setValorEntregado(double valorEntregado) {
        this.valorEntregado = valorEntregado;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
    
    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
