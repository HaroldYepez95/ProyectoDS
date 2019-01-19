/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class Compra {
    private int idCompra;
    private ArrayList<ProductoCompra> productos;
    private String estado;
    private Pago pago;
    private Entrega entrega;

    public Compra(int idCompra, ArrayList<ProductoCompra> productos, String estado, Pago pago, Entrega entrega) {
        this.idCompra = idCompra;
        this.productos = productos;
        this.estado = estado;
        this.pago = pago;
        this.entrega = entrega;
    }

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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    
    public void anular(){
        
    }
    public void agregarProductos(){
        
    }
    public void quitarProductos(){
        
    }
    public void calcularTotal(){
        
    }
    public void pagar(){
        
    }
}
