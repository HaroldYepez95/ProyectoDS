/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDAO.Estudiante;

import ClasesAuxiliares.Producto;
import java.util.ArrayList;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public interface IEstudianteDAO {

    public void create(Producto producto) throws Exception;

    public ArrayList<Producto> read() throws Exception;

    public void update() throws Exception;

    public void delete() throws Exception;

}
