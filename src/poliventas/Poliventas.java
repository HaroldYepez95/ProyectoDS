/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliventas;

import Extra.Validate;
import PatronDAO.Compra.CompraDAOImpl;
import PatronDAO.Producto.ProductoDAOImpl;
import PatronSingleton.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Poliventas extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();

        ProductoDAOImpl pdao = new ProductoDAOImpl();
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
        }
        launch(args);
        conexion.desconectar();

    }

}
