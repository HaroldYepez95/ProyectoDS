/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private LocalDate fechaIngreso;
    private double precioUnitario;
    private ArrayList<String> categorias; 
    private String descripcion;
    private int stock;
    private LocalTime tiempoMaxEntrega;
    private ArrayList<Integer> calificaciones;
    private int calificacionPromedio;
    private int nroBusquedas;

    public Producto(int idProducto, String nombre, LocalDate fechaIngreso, double precioUnitario, ArrayList<String> categorias, String descripcion, int stock, LocalTime tiempoMaxEntrega, ArrayList<Integer> calificaciones, int calificacionPromedio, int nroBusquedas) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.precioUnitario = precioUnitario;
        this.categorias = categorias;
        this.descripcion = descripcion;
        this.stock = stock;
        this.tiempoMaxEntrega = tiempoMaxEntrega;
        this.calificaciones = calificaciones;
        this.calificacionPromedio = calificacionPromedio;
        this.nroBusquedas = nroBusquedas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalTime getTiempoMaxEntrega() {
        return tiempoMaxEntrega;
    }

    public void setTiempoMaxEntrega(LocalTime tiempoMaxEntrega) {
        this.tiempoMaxEntrega = tiempoMaxEntrega;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(int calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public int getNroBusquedas() {
        return nroBusquedas;
    }

    public void setNroBusquedas(int nroBusquedas) {
        this.nroBusquedas = nroBusquedas;
    }
    
    public ArrayList<Producto> obtenerNuevosProductos(){
        ArrayList<Producto> nuevosProd = new ArrayList<Producto>();
        return nuevosProd;
    }
    public ArrayList<Producto> obtenerMasBuscados(){
        ArrayList<Producto> masBuscados = new ArrayList<Producto>();
        return masBuscados;
    }
}
