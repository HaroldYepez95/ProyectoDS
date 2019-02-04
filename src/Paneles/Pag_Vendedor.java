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
public class Pag_Vendedor {
    private Label lbtitulo;
    private VBox contenedor;
    private Button btnMiVenta;
    private Button btnMiProducto;
    private Button btnCerrar;
    public void Contenido(){
        lbtitulo=new Label("Vendedor");
        lbtitulo.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnMiVenta=new Button("Mis Ventas");
        btnMiProducto=new Button("Mis Productos");
        btnCerrar=new Button("Cerrar");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(lbtitulo,btnMiVenta,btnMiProducto,btnCerrar);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
         btnCerrar.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Inicio().getRoot() );
            ((Stage)s.getWindow()).setTitle("Menu");
        });
          btnMiVenta.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_vendedorVentas().getRoot() );
            ((Stage)s.getWindow()).setTitle("Mis Ventas");
        });
          btnMiProducto.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_VendedorMisProductos().getRoot() );
            ((Stage)s.getWindow()).setTitle("Mis Productos");
        });
         
    }
     public Pag_Vendedor(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
}
