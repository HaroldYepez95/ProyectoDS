/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import ClasesAuxiliares.Producto;
import PatronDAO.Producto.ProductoDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tonny
 */
public class Pag_ArticulosMasBuscado {private Label lbtitle;
    private TableView tablaArticulos;
    private TableColumn<Producto,String> nombre;
    private TableColumn<Producto,String> precio;;
    private Button btnCancelar;
    private HBox hb1;
    private VBox vb1;
    
    
    public Pag_ArticulosMasBuscado(){
       tablaArticulos=new TableView();
       tablaArticulos.setEditable(true);
       tablaArticulos.autosize();
       
        
       setColumnas();
    }
    private void setColumnas() {
        lbtitle =new Label("Articulo Mas Buscado");
        lbtitle.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnCancelar=new Button("cancelar");
        btnCancelar.setOnAction(e -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            ((Stage) s.getWindow()).setTitle("Comprador");
            s.setRoot(new Pag_Comprador().getRoot());

        });
        
         
        
        nombre=new TableColumn("Nombre");
        nombre.setMinWidth(120);
        nombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        precio=new TableColumn("Precio");
        precio.setMinWidth(100);
        precio.setCellValueFactory(new PropertyValueFactory<>("precioUnitario"));
        
        
        tablaArticulos.getColumns().addAll(nombre,precio);
        
        tablaArticulos.setItems(ProductoDAOImpl.MasBuscado);
        hb1=new HBox();
        hb1.getChildren().addAll(btnCancelar);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(20);
        vb1=new VBox();
        vb1.getChildren().addAll(lbtitle,tablaArticulos,hb1);
        vb1.setAlignment(Pos.CENTER);
        vb1.setSpacing(20);
     
        
    }
    public Pane getRoot(){
        return vb1;
    }
    
    
}
