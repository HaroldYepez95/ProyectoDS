/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
    private Button btnBuscar;
    private Button btnCompras;
    private Button btnAdminProducto;
    private Button btnCerrar;
    
    public void Contenido(){
        lbtitulo=new Label("Administrador");
        btnBuscar=new Button("Buscar");
        btnCompras=new Button("Ver Compras");
        btnAdminProducto=new Button("Administrar Productos");
        btnCerrar=new Button("Cerrar");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(lbtitulo,btnBuscar,btnCompras,btnAdminProducto,btnCerrar);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
         btnCerrar.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Inicio().getRoot() );
            ((Stage)s.getWindow()).setTitle("Menu");
        });
        
    }
    public Pag_Admin(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}
