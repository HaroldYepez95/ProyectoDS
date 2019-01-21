/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

import PatronSingleton.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Normalizer;
import java.util.HashMap;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class Validate {

    private final Conexion conexion = Conexion.getInstancia();
    private final Connection connection = conexion.getConnection();
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;
    private HashMap<String, String> tablas = new HashMap<>();

    {
        tablas.put("Personas", "Cedula");
        tablas.put("PersonasTelefonos", "idPersonaTelefono");
        tablas.put("PersonasDomicilios", "idPersonaDomicilio");
        tablas.put("PersonasCorreos", "idPersonaCorreo");
        tablas.put("Estudiantes", "Matricula");
        tablas.put("Compradores", "idComprador");
        tablas.put("Vendedores", "idVendedor");
        tablas.put("CalificacionesVendedores", "idCalificacionVendedor");
        tablas.put("Operaciones", "idOperacion");
        tablas.put("CalificacionesProductos", "idCalificacionProducto");
        tablas.put("Pagos", "idPago");
        tablas.put("PagosEfectivo", "idPagoEfectivo");
        tablas.put("ComprasSaldos", "idCompraSaldo");
        tablas.put("ComprasVentas", "idComprasVentas");
        tablas.put("ComprasVentasProductos", "idCompraVentaProducto");
        tablas.put("Entregas", "idEntrega");
        tablas.put("Productos", "idProducto");
        tablas.put("EntregasProductos", "idEntregaProducto");
    }

    public static Boolean isNumeric(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String normalizeString(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFKD).replaceAll(",", "");
        return str.replaceAll("[^a-z,^A-Z,^0-9]", "");
    }

    public static boolean validarCadenaBusquedaSencilla(String cadena) {
        boolean condicion1 = (cadena.length() - cadena.replaceAll(" ", "").length()) < 3,
                condicion2 = !(cadena.isEmpty());
        if (condicion1 && condicion2) {
            String normalizeString = normalizeString(cadena);

        }

        return true;
    }

    public boolean esUsuarioEstudiante(String usuario, String clave) throws Exception {
        int matricula;

        conexion.conectar();
        cs = connection.prepareCall("{CALL verificarEstudiante(?, ?)}");
        cs.setString(1, usuario);
        cs.setString(2, clave);
        rs = cs.executeQuery();
        rs.next();
        matricula = rs.getInt("Matricula");
        cs.close();

        if (matricula == 0) {
            return false;
        } else {
            return true;
        }

    }

    public String ultimoId(String tabla) throws Exception {
        String value = "";

        conexion.conectar();
        String query = "SELECT MAX(" + tablas.get(tabla) + ") AS ultimo FROM " + tabla;
        ps = connection.prepareStatement(query);
        rs = ps.executeQuery();
        rs.next();
        value = String.valueOf(rs.getObject("ultimo"));
        ps.close();

        if (value.equals("null")) {
            return "0";
        } else {
            return value;
        }

    }
    
    //Permite mostrar el nombre y el rol cuando inicia sesion un estudiante, sin tener que crear una instancia de un estudiante
    public ResultSet obtenerNombreRolEstudiante(String matricula) throws Exception {

        cs = connection.prepareCall("{CALL obtenerNroHistoriaCedula(?)}");
        cs.setString(1, matricula);
        rs = cs.executeQuery();
        rs.next();
        cs.close();

        if (rs == null) {
            throw new Exception("No existe estudiante con esa matricula");
        } else {
            return rs;
        }

    }


    public int obtenerNroHistoriaNombre(String nombre) throws Exception {

        cs = connection.prepareCall("{CALL obtenerNroHistoriaNombre(?)}");
        cs.setString(1, nombre);
        rs = cs.executeQuery();

        rs.next();
        int nroHistoria = rs.getInt("nroHistoria");
        cs.close();

        if (nroHistoria == 0) {
            throw new Exception("No existe persona con ese nombre");
        } else {
            return nroHistoria;
        }

    }

 
    public HashMap<String, String> getTablas() {
        return tablas;
    }

    public void setTablas(HashMap<String, String> tablas) {
        this.tablas = tablas;
    }

}
