/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FamiliaPersona;

import ClasesAuxiliares.IBuscable;
import ClasesAuxiliares.Producto;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Estudiante implements IBuscable{
    
    private Estudiante estudiante;
    
    public void registrarEstudiante(){
        
    }
    
    public void administraProductos(){
        //Operaciones CRUD
    }
    public void administrarEstudiantes(){
        //Operaciones CRUD
    }

    @Override
    public ArrayList<Producto> realizarBusquedaSencilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> realizarBusquedaAvanzada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
