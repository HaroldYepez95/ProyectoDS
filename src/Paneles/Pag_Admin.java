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
public class Pag_Admin {
    private Label lbtitulo;
    private VBox contenedor;
    private Button btnAdminUsuario;
    private Button btnBuscar;
    private Button btnCompras;
    private Button btnAdminProducto;
    private Button btnCerrar;
    
    public void Contenido(){
        lbtitulo=new Label("Administrador");
        lbtitulo.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnAdminUsuario=new Button("Administrar Usuario");
        btnBuscar=new Button("Buscar");
        btnCompras=new Button("Ver Compras");
        btnAdminProducto=new Button("Administrar Productos");
        btnCerrar=new Button("Cerrar");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(lbtitulo,btnAdminUsuario,btnBuscar,btnCompras,btnAdminProducto,btnCerrar);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
         btnCerrar.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Inicio().getRoot() );
            ((Stage)s.getWindow()).setTitle("Menu");
        });
         btnBuscar.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_AdminBuscar().getRoot() );
            ((Stage)s.getWindow()).setTitle("Busqueda Producto");
        });
         btnCompras.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_AdminCompras().getRoot() );
            ((Stage)s.getWindow()).setTitle("Compras");
        });
        
    }
    public Pag_Admin(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}
