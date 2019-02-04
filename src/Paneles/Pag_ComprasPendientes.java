/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import ClasesAuxiliares.Producto;
import PatronDAO.Compra.CompraDAOImpl;
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
public class Pag_ComprasPendientes {
    private Label lbtitle;
    private TableView tablaCompras;
    private TableColumn<Producto,String> nombre;
    private TableColumn<Producto,String> codigo;
    private TableColumn<Producto,String> categoria;
     
    private TableColumn<Producto,String> precio;;
    private Button btnCancelar;
    private HBox hb1;
    private VBox vb1;
    private Button btngenerar;
    
    public Pag_ComprasPendientes(){
       tablaCompras=new TableView();
       tablaCompras.setEditable(true);
       tablaCompras.autosize();
       
        
       setColumnas();
    }
    private void setColumnas(){
        lbtitle =new Label("Compras Pendientes");
        btnCancelar=new Button("cancelar");
        btnCancelar.setOnAction(e -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            ((Stage) s.getWindow()).setTitle("Info Pet");
            s.setRoot(new Pag_CompradorMiPedido().getRoot());

        });
        btngenerar=new Button("Generar PDF");
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
        
        
        tablaCompras.getColumns().addAll(codigo,categoria,nombre,precio);
        tablaCompras.setItems(CompraDAOImpl.CompraPendiente);
        hb1=new HBox();
        hb1.getChildren().addAll(btnCancelar, btngenerar);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(20);
        vb1=new VBox();
        vb1.getChildren().addAll(lbtitle,tablaCompras,hb1);
        vb1.setAlignment(Pos.CENTER);
        vb1.setSpacing(20);
     
        
    }
    public Pane getRoot(){
        return vb1;
    }
            
            
}
