/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaOperacion;

import ClasesAuxiliares.ProductoCompra;
import PatronStrategy.IPago;
import java.util.ArrayList;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class Compra extends Operacion {

    private int idCompra;
    private ArrayList<ProductoCompra> productos;
    private String estado;
    private double montoTotal;
    private IPago pago;
    private Entrega entrega;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ArrayList<ProductoCompra> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoCompra> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", productos=" + productos + ", estado=" + estado + ", montoTotal=" + montoTotal + ", pago=" + pago + ", entrega=" + entrega + '}';
    }
    
    

}
