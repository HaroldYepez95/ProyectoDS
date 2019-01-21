/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaPersona;

import FamiliaOperacion.Compra;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona {

    protected int matricula;
    protected String usuario, contraseña, rol;

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

    public void iniciarSesion() {

    }

    public void cerrarSesion() {

    }
    
    public ArrayList<Compra> obtenerComprasPendientes(){
        return null;
    }
    
    public ArrayList<Compra> obtenerComprasExitosas(){
        return null;
    }
    
    public ArrayList<Compra> obtenerComprasAnuladas(){
        return null;
    }
    
    public ArrayList<Compra> obtenerResumenCompras(){
        return null;
    }
    
    
}
