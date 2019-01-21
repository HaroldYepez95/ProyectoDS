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
public class Vendedor extends Comprador{
    private int idVendedor;
    private ArrayList<Integer> calificacions;
    private int calificacionPromedio;
    private ArrayList<Producto> mercaderia;

    public Vendedor(int idVendedor, ArrayList<Integer> calificacions, int calificacionPromedio, ArrayList<Producto> mercaderia, int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
        this.idVendedor = idVendedor;
        this.calificacions = calificacions;
        this.calificacionPromedio = calificacionPromedio;
        this.mercaderia = mercaderia;
    }

   

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public ArrayList<Integer> getCalificacions() {
        return calificacions;
    }

    public void setCalificacions(ArrayList<Integer> calificacions) {
        this.calificacions = calificacions;
    }

    public int getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(int calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public ArrayList<Producto> getMercaderia() {
        return mercaderia;
    }

    public void setMercaderia(ArrayList<Producto> mercaderia) {
        this.mercaderia = mercaderia;
    }
    
    
}
