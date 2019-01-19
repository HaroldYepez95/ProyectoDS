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
public abstract class Persona {
    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected boolean tieneWhatsApp;
    protected String telefonoActual;
    protected ArrayList<String> correos;
    protected ArrayList<String> domicilios;
    protected ArrayList<String> telefonosSecundarios;

    public Persona(String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tieneWhatsApp = tieneWhatsApp;
        this.telefonoActual = telefonoActual;
        this.correos = correos;
        this.domicilios = domicilios;
        this.telefonosSecundarios = telefonosSecundarios;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isTieneWhatsApp() {
        return tieneWhatsApp;
    }

    public void setTieneWhatsApp(boolean tieneWhatsApp) {
        this.tieneWhatsApp = tieneWhatsApp;
    }

    public String getTelefonoActual() {
        return telefonoActual;
    }

    public void setTelefonoActual(String telefonoActual) {
        this.telefonoActual = telefonoActual;
    }

    public ArrayList<String> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<String> correos) {
        this.correos = correos;
    }

    public ArrayList<String> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(ArrayList<String> domicilios) {
        this.domicilios = domicilios;
    }

    public ArrayList<String> getTelefonosSecundarios() {
        return telefonosSecundarios;
    }

    public void setTelefonosSecundarios(ArrayList<String> telefonosSecundarios) {
        this.telefonosSecundarios = telefonosSecundarios;
    }
    
    

}
