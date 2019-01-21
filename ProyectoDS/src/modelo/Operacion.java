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
public abstract class Operacion {
    protected int idOperacion;
    protected int idVendedor;
    protected int idComprador;
    protected LocalDate fechaHora;

    public Operacion(int idOperacion, int idVendedor, int idComprador, LocalDate fechaHora) {
        this.idOperacion = idOperacion;
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.fechaHora = fechaHora;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
}
