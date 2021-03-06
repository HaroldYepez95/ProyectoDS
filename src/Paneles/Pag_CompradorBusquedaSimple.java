/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import ClasesAuxiliares.Producto;
import PatronDAO.Producto.ProductoDAOImpl;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tonny
 */
// nombre, categoría, precio, tiempo máximo de entrega y
//calificación del producto y del vendedor 
public class Pag_CompradorBusquedaSimple {
     private Label lbtitle;
     private Button btnSimple;
     private Button btnCancelar;
     private TextField txtsimple;
     private HBox hb1;
     private VBox vb1;
     private TableView<Producto> tablaBusquedaSimple;
     private TableColumn<Producto,String> codigo;
     private TableColumn<Producto,String> categoria;
     private TableColumn<Producto,String> nombre;
     private TableColumn<Producto,String> precio;
    public Pag_CompradorBusquedaSimple(){
       tablaBusquedaSimple=new TableView();
       tablaBusquedaSimple.setEditable(true);
       tablaBusquedaSimple.autosize();
       txtsimple=new TextField();
        
       setColumnas();
    }
    private void setColumnas(){
        lbtitle =new Label("Busqueda Simple");
        lbtitle.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnSimple=new Button("Busqueda");
        btnSimple.setOnAction(e -> {
           
        });
        btnCancelar=new Button("cancelar");
        btnCancelar.setOnAction(e -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            ((Stage) s.getWindow()).setTitle("Info Pet");
            s.setRoot(new Pag_CompradorBusqueda().getRoot());

        });
       
        
        codigo=new TableColumn("IdProducto");
        codigo.setMinWidth(100);
        codigo.setCellValueFactory(new PropertyValueFactory<>("idProducto"));
        categoria=new TableColumn("Categoria");
        categoria.setMinWidth(150);
        categoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        nombre=new TableColumn("Nombre");
        nombre.setMinWidth(120);
        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        precio=new TableColumn("Precio");
        precio.setMinWidth(100);
        precio.setCellValueFactory(new PropertyValueFactory<>("precioUnitario"));
        
        
        tablaBusquedaSimple.getColumns().addAll(codigo,categoria,nombre,precio);
        tablaBusquedaSimple.setItems(ProductoDAOImpl.BusquedaSencillaN);
        hb1=new HBox();
        hb1.getChildren().addAll(btnSimple, txtsimple);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(20);
        vb1=new VBox();
        vb1.getChildren().addAll(lbtitle,hb1,tablaBusquedaSimple,btnCancelar);
        vb1.setAlignment(Pos.CENTER);
        vb1.setSpacing(20);
     
    
    }
    public Pane getRoot(){
        return vb1;
    }
}