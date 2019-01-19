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
public class CompraSaldo {
    private int idCompraSaldo;
    private LocalDate fechaHora;
    private double saldoDisponible;
    private String celularAsociado;
    private double saldo;

    public CompraSaldo(int idCompraSaldo, LocalDate fechaHora, double saldoDisponible, String celularAsociado, double saldo) {
        this.idCompraSaldo = idCompraSaldo;
        this.fechaHora = fechaHora;
        this.saldoDisponible = saldoDisponible;
        this.celularAsociado = celularAsociado;
        this.saldo = saldo;
    }

    public int getIdCompraSaldo() {
        return idCompraSaldo;
    }

    public void setIdCompraSaldo(int idCompraSaldo) {
        this.idCompraSaldo = idCompraSaldo;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getCelularAsociado() {
        return celularAsociado;
    }

    public void setCelularAsociado(String celularAsociado) {
        this.celularAsociado = celularAsociado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
