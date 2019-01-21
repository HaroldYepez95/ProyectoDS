/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaPersona;

import ClasesAuxiliares.CompraSaldo;
import ClasesAuxiliares.IBuscable;
import ClasesAuxiliares.Producto;
import java.util.ArrayList;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class Comprador implements IBuscable {
    protected int idComprador;
    protected double saldoDisponible;
    protected CompraSaldo compraSaldo;
    protected ArrayList<Producto> misProductos;

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public CompraSaldo getCompraSaldo() {
        return compraSaldo;
    }

    public void setCompraSaldo(CompraSaldo compraSaldo) {
        this.compraSaldo = compraSaldo;
    }

    public ArrayList<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(ArrayList<Producto> misProductos) {
        this.misProductos = misProductos;
    }

    @Override
    public ArrayList<Producto> realizarBusquedaSencilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> realizarBusquedaAvanzada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
