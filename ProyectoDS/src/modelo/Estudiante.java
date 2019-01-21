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
public abstract class Estudiante extends Persona{
    protected int matricula;
    protected String usuario;
    protected String contraseña;
    protected String rol;

    public Estudiante(int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
        this.matricula = matricula;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public void iniciarSesion(){
        
    }
    public void cerrarSesion(){
        
    }
    public ArrayList<Compra> obtenerComprasPendientes(){
        ArrayList<Compra> comprasPendientes = new ArrayList<Compra>();
        return comprasPendientes; 
    }
    public ArrayList<Compra> obtenerComprasExitosas(){
        ArrayList<Compra> comprasExitosas = new ArrayList<Compra>();
        return comprasExitosas; 
    }
    public ArrayList<Compra> obtenerComprasAnuladas(){
        ArrayList<Compra> comprasAnuladas = new ArrayList<Compra>();
        return comprasAnuladas; 
    }
    public ArrayList<Compra> obtenerResumenCompras(){
        ArrayList<Compra> resumenCompras = new ArrayList<Compra>();
        return resumenCompras; 
    }
}
