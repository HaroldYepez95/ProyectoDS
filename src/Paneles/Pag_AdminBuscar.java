/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tonny
 */
public class Pag_AdminBuscar {
    private Label titulo;
    private VBox contenedor;
    private Button btnSimple;
    private Button btnAvanzada;
    
    private Button btnAtras;
    
    public void Contenido(){
        titulo=new Label("Busqueda");
        titulo.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnSimple=new Button("Simple");
        btnAvanzada=new Button("Avanzada");
        btnAtras=new Button("Atras");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(titulo,btnSimple,btnAvanzada,btnAtras);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
        btnAtras.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Admin().getRoot() );
            ((Stage)s.getWindow()).setTitle("Administrador");
        });

    }
    public Pag_AdminBuscar(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}
