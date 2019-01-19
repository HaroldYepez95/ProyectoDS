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
public class Administrador extends Estudiante{

    public Administrador(int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
    }

    public void registrarEstudiante(){
        
    }
    public void administrarProductos(){
        
    }
    public void administrarEstudiantes(){
        
    }
}
