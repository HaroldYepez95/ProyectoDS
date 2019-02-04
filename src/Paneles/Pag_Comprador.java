/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Extra.Validate;
import PatronDAO.Producto.ProductoDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Pag_Comprador {
    private Label lbtitulo;
    private VBox contenedor;
    private Button btnBusqueda;
    private Button btnMiPedido;
    private Button btnArticulo_Buscado;
    private Button btnNuevosArt;
    private Button btnCerrar;
       public void Contenido(){
        lbtitulo=new Label("Comprador");
        lbtitulo.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnMiPedido=new Button("Mis Pedidos");
        btnBusqueda=new Button("Busqueda");
        btnArticulo_Buscado=new Button("Articulos mas Buscados");
        btnNuevosArt=new Button("Nuevos Articulos");
        btnCerrar=new Button("Cerrar");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(lbtitulo,btnBusqueda,btnMiPedido,btnArticulo_Buscado, btnNuevosArt,btnCerrar);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
         btnCerrar.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Inicio().getRoot() );
            ((Stage)s.getWindow()).setTitle("Menu");
        });
         btnBusqueda.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_CompradorBusqueda().getRoot() );
            ((Stage)s.getWindow()).setTitle("Busqueda");
        });
         btnMiPedido.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_CompradorMiPedido().getRoot() );
            ((Stage)s.getWindow()).setTitle("Mis Pedidos");
        });
        btnArticulo_Buscado.setOnAction((e) -> { 
            
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_ArticulosMasBuscado().getRoot() );
            ((Stage)s.getWindow()).setTitle("Articulos Mas Buscado");
                
                
            
           
        }); 
    }
     public Pag_Comprador(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
}
