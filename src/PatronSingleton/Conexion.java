/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class Conexion {

    private static Conexion instancia;
    private Connection connection;
    private final String USER = "root",
            PWD = "espol1234",
            URL = "jdbc:mysql://127.0.0.1:3306/poliventasdb?useUnicode=true&useTimezone=true&serverTimezone=UTC&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";

    private Conexion() {
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar() throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
        connection = DriverManager.getConnection(URL, USER, PWD);
        System.out.println("Conexión MySql exitosa");
    }

    public void desconectar() throws SQLException {
        if (connection != null) {
            if (!connection.isClosed()) {
                connection.close();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
