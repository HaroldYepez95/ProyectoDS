/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Harold
 */
public interface ICompraDAO {
    public void create(Compra compra) throws Exception;
    public void read() throws Exception;
    public void update() throws Exception;
    public void delete() throws Exception;
}
