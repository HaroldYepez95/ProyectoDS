/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAuxiliares;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class Producto {

    private int idProducto, idProvider, calificacionPromedioProducto, calificacionPromedioVendedor, nroBusquedas, cantidadDisponible;
    private String nombre, descripcion, categoria;
    private LocalDate fechaIngreso;
    private double precioUnitario;
    private LocalTime tiempoMaxEntrega;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getNroBusquedas() {
        return nroBusquedas;
    }

    public void setNroBusquedas(int nroBusquedas) {
        this.nroBusquedas = nroBusquedas;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalTime getTiempoMaxEntrega() {
        return tiempoMaxEntrega;
    }

    public void setTiempoMaxEntrega(LocalTime tiempoMaxEntrega) {
        this.tiempoMaxEntrega = tiempoMaxEntrega;
    }

    public int getCalificacionPromedioProducto() {
        return calificacionPromedioProducto;
    }

    public void setCalificacionPromedioProducto(int calificacionPromedioProducto) {
        this.calificacionPromedioProducto = calificacionPromedioProducto;
    }

    public int getCalificacionPromedioVendedor() {
        return calificacionPromedioVendedor;
    }

    public void setCalificacionPromedioVendedor(int calificacionPromedioVendedor) {
        this.calificacionPromedioVendedor = calificacionPromedioVendedor;
    }

    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", idProvider=" + idProvider + ", calificacionPromedioProducto=" + calificacionPromedioProducto + ", calificacionPromedioVendedor=" + calificacionPromedioVendedor + ", nroBusquedas=" + nroBusquedas + ", cantidadDisponible=" + cantidadDisponible + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", fechaIngreso=" + fechaIngreso + ", precioUnitario=" + precioUnitario + ", tiempoMaxEntrega=" + tiempoMaxEntrega + '}';
    }

}
