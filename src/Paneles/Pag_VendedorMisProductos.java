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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tonny
 */
public class Pag_VendedorMisProductos {
    private Label lbtitle;
    private VBox vb1;
    private TableView tablaMisProductos;
    private TableColumn<Producto,String> idProducto;
     private TableColumn<Producto,String> categoria;
     private TableColumn<Producto,String> nombre;
     private TableColumn<Producto,String> Descripcion;
     private TableColumn<Producto,String> idProvider;
     private TableColumn<Producto,String> FechaIngreso;
     private Button btnCancelar;
     private Button btnBorrar;
     private Button btnEditar;
     private HBox hb1;
    public Pag_VendedorMisProductos(){
       tablaMisProductos=new TableView();
       tablaMisProductos.setEditable(true);
       tablaMisProductos.autosize();
      
        
       setColumnas();
    }
     private void setColumnas(){
        lbtitle =new Label("Mis Productos");
        lbtitle.setStyle("-fx-font-family: \"Arial Black\";"+"-fx-font-size: 25px;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-background-color:#000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);"+"-fx-background-insets: 0,1,2,3;"+"-fx-padding: 12 30 12 30;");
        btnBorrar=new Button("Borrar");
        btnBorrar.setOnAction(e -> {
           
        });
        btnEditar=new Button("Editar");
        btnBorrar.setOnAction(e -> {
           
        });
        btnCancelar=new Button("cancelar");
        btnCancelar.setOnAction(e -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            ((Stage) s.getWindow()).setTitle("Info Pet");
            s.setRoot(new Pag_Vendedor().getRoot());

        });
        idProvider=new TableColumn("idProvider");
        idProvider.setMinWidth(100);
        idProvider.setCellValueFactory(new PropertyValueFactory<>("idProvider"));
        FechaIngreso=new TableColumn("FechaIngreso");
        FechaIngreso.setMinWidth(100);
        FechaIngreso.setCellValueFactory(new PropertyValueFactory<>("FechaIngreso"));
        idProducto=new TableColumn("FechaIngreso");
        idProducto.setMinWidth(100);
        idProducto.setCellValueFactory(new PropertyValueFactory<>("idProducto"));
        categoria=new TableColumn("Categoria");
        categoria.setMinWidth(150);
        categoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        nombre=new TableColumn("Nombre");
        nombre.setMinWidth(120);
        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        Descripcion=new TableColumn("Precio");
        Descripcion.setMinWidth(100);
        Descripcion.setCellValueFactory(new PropertyValueFactory<>("precioUnitario"));
        
        
        tablaMisProductos.getColumns().addAll(idProducto,categoria,nombre,Descripcion);
        tablaMisProductos.setItems(ProductoDAOImpl.MisProductos);
        hb1=new HBox();
        hb1.getChildren().addAll(btnCancelar,btnEditar,btnBorrar);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(20);
        vb1=new VBox();
        vb1.getChildren().addAll(lbtitle,tablaMisProductos,hb1);
        vb1.setAlignment(Pos.CENTER);
        vb1.setSpacing(20);
     
    
    }
    public Pane getRoot(){
        return vb1;
    }
}
