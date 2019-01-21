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
public class Comprador extends Estudiante implements IBuscable{
    private int idComprador;
    private Double saldoDisponible;
    private CompraSaldo compraSaldo;
    private ArrayList<Producto> misProductos;

    public Comprador(int idComprador, Double saldoDisponible, CompraSaldo compraSaldo, ArrayList<Producto> misProductos, int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
        this.idComprador = idComprador;
        this.saldoDisponible = saldoDisponible;
        this.compraSaldo = compraSaldo;
        this.misProductos = misProductos;
    }

    public Comprador(int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
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

    public void calificarVendedor(){
        
    }

    public void calificarProducto(){
        
    }
    public void comprarSaldo(){
        
    }

    @Override
    public void realizarBusquedaSencilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realizarBusquedaAvanzada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}