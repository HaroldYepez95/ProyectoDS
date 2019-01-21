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
public class Pag_CompradorBusqueda {
     private Label titulo;
    private VBox contenedor;
    private Button btnSimple;
    private Button btnAvanzada;
    
    private Button btnAtras;
    
    public void Contenido(){
        titulo=new Label("Busqueda");
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

    }
    public Pag_CompradorBusqueda(){
         Contenido();
    }
    public Pane getRoot(){
        return contenedor;
    }
    
}
