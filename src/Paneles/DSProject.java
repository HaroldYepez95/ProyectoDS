/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import PatronSingleton.Conexion;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Tonny
 */
public class DSProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Pag_Inicio inicio=new Pag_Inicio();
       
       Pane contenedor2=inicio.getRoot();
       //Pag_Admin menuAdmin=new Pag_Admin();
       //Pane contenedor3=menuAdmin.getRoot();
       //Pag_AdminBuscar menuAdminBusqueda=new Pag_AdminBuscar();
      // Pag_AdminCompras menuAdminCompra=new Pag_AdminCompras();
       //Pane contenedor5=menuAdminCompra.getRoot();
       
       // Pag_Vendedor menuVendedor=new Pag_Vendedor();  
       //Pane contenedor6=menuVendedor.getRoot();
       //Pag_Comprador menuComprador=new Pag_Comprador();
       //Pane contenedor7=menuComprador.getRoot();
        Scene scene = new Scene(contenedor2, 500, 550);
        
        primaryStage.setTitle("Menu");
        //StackPane root= new StackPane();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        launch(args);
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();
    }
    
}
