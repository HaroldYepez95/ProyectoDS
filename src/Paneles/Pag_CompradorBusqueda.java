/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Extra.Validate;
import PatronDAO.Compra.CompraDAOImpl;
import PatronDAO.Producto.ProductoDAOImpl;
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
public class Pag_CompradorBusqueda {
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
            s.setRoot(new Pag_Comprador().getRoot() );
            ((Stage)s.getWindow()).setTitle("Administrador");
        });
        btnSimple.setOnAction((e) -> {   
            /*ProductoDAOImpl pdao = new ProductoDAOImpl();
            CompraDAOImpl cdo= new CompraDAOImpl();
            System.out.println("validando cadena: " + Validate.normalizeString("ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏ __$&*@!#+!!-\\{}:;= U.S. Art Supply 5.5\" x 8.5\" Premium Spiral Bound Sketch Pad, Pad of 100-Sheets, 60 Pound (100gsm) (Pack of 2 Pads)"));
            try {
                System.out.println("Busqueda sencilla nombre" + pdao.busquedaSencillaNombre("Audifonos".trim()));
                System.out.println("Busqueda sencilla descripicion" + pdao.busquedaSencillaDescripcion("Tecnologia"));
                System.out.println("Compras pendientes "+ cdo.readPendientes(201563748,"Compra"));
                System.out.println("Ventas pendientes "+ cdo.readPendientes(201515424,"Venta"));
                System.out.println("Mis productos "+ pdao.readMisProductos(201515424));
            
            } catch (Exception ex) {
                ex.printStackTrace();
            }*/
            
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_CompradorBusquedaSimple().getRoot() );
            ((Stage)s.getWindow()).setTitle("Busqueda Simple");
        });
    }
    public Pag_CompradorBusqueda(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}
