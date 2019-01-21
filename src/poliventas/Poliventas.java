/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliventas;

import Extra.Validate;
import PatronDAO.Compra.CompraDAOImpl;
import PatronDAO.Producto.ProductoDAOImpl;
import PatronSingleton.Conexion;
import Vista.Pag_Comprador;
import Vista.Pag_Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Poliventas extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       Pag_Inicio inicio=new Pag_Inicio();
       Pane contenedor2=inicio.getRoot();
       
       //Pag_Admin menuAdmin=new Pag_Admin();
       //Pane contenedor3=menuAdmin.getRoot();
       
       //Pag_AdminBuscar menuAdminBusqueda=new Pag_AdminBuscar();
       //Pag_AdminCompras menuAdminCompra=new Pag_AdminCompras();
       //Pane contenedor5=menuAdminCompra.getRoot();
       
       //Pag_Vendedor menuVendedor=new Pag_Vendedor();  
       //Pane contenedor6=menuVendedor.getRoot();
       
        //Pag_Comprador menuComprador=new Pag_Comprador();
        //Pane contenedor7=menuComprador.getRoot();
        
        Scene scene = new Scene(contenedor2, 500, 550);
        
        stage.setTitle("Menu");
        //StackPane root= new StackPane();
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();

        
        launch(args);
        conexion.desconectar();

    }

}
