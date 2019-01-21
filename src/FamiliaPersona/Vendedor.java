/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaPersona;

import ClasesAuxiliares.Producto;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Vendedor extends Comprador {

    private int idVendedor, calificacionPromedio;
    private ArrayList<Producto> mercaderia;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
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
