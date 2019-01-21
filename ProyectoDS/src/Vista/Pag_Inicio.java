/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Tonny
 */
public class Pag_Inicio {
    private Label titulo;
    private Label usuario;
    private Label contrasena;
    private TextField txtNombre;
    private TextField txtContrasena;
    private Button btn_Inicio;
    private Button btn_Salir;
    private HBox cajaUsuario;
    private HBox cajaContrasena;
    private VBox cajaGeneral;
    private Button iniciar;
    public void Contenido(){
        titulo=new Label("Poliventas");
        titulo.setAlignment(Pos.CENTER);
        
        //inico hbox1
        cajaUsuario=new HBox();
        usuario=new Label("Usuario");
        txtNombre=new TextField();
        cajaUsuario.getChildren().addAll(usuario,txtNombre);
        cajaUsuario.setAlignment(Pos.CENTER);
        cajaUsuario.setSpacing(20);
        // inicio Hbox2
        cajaContrasena=new HBox();
        contrasena=new Label("Contraseña");
        txtContrasena=new TextField();
        cajaContrasena.getChildren().addAll(contrasena,txtContrasena);
        cajaContrasena.setAlignment(Pos.CENTER);
        cajaContrasena.setSpacing(20);
        
        iniciar=new Button("Iniciar Sesion");
        iniciar.setAlignment(Pos.CENTER);
        
        //inicio VBox
        cajaGeneral=new VBox();
        cajaGeneral.getChildren().addAll(titulo,cajaUsuario,cajaContrasena,iniciar);
        cajaGeneral.setSpacing(20);
        cajaGeneral.setAlignment(Pos.CENTER);
        
      
        
        
    }
    public Pag_Inicio(){
         Contenido();
    }
    public Pane getRoot(){
        return cajaGeneral;
    }
    
    
    
}
