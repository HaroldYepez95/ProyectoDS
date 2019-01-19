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
public interface ILoginDAO {
    public boolean autenticarEstudiante(String usuario, String password) throws Exception;
}
