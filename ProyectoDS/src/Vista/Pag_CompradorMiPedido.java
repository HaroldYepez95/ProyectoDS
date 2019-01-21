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
public class Pag_CompradorMiPedido {
     private Label titulo;
    private VBox contenedor;
    private Button btnPendiente;
    private Button btnHistorial;
   
    private Button btnAtras;
    public void Contenido(){
        titulo=new Label("Compras");
        btnPendiente=new Button("Compras Pendientes");
        btnHistorial=new Button("Historial");
        
        btnAtras=new Button("Atras");
        
        contenedor=new VBox();
        contenedor.getChildren().addAll(titulo,btnPendiente,btnHistorial,btnAtras);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setSpacing(20);
        btnAtras.setOnAction((e) -> {
            Button b = (Button) e.getSource();
            Scene s = b.getScene();
            s.setRoot(new Pag_Comprador().getRoot() );
            ((Stage)s.getWindow()).setTitle("Comprador");
        });
}
    public Pag_CompradorMiPedido(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}