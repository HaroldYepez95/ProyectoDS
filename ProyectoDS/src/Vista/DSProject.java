/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
       
       // Pag_Inicio inicio=new Pag_Inicio();
       
       // Pane contenedor2=inicio.getRoot();
       Pag_Admin menuAdmin=new Pag_Admin();
       Pane contenedor3=menuAdmin.getRoot();
        
        Scene scene = new Scene(contenedor3, 500, 550);
        
        primaryStage.setTitle("Menu");
        //StackPane root= new StackPane();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
