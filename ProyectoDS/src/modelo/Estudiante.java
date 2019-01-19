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

    
    
}
