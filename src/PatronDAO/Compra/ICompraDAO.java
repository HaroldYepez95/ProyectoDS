/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDAO.Compra;

import FamiliaOperacion.Compra;
import java.util.ArrayList;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public interface ICompraDAO {
    public void create(Compra compra) throws Exception;
    public ArrayList<Compra> read() throws Exception;
    public ArrayList<Compra> readPendientes(int matricula, String tipo) throws Exception;
    public void update() throws Exception;
    public void delete() throws Exception;
}
