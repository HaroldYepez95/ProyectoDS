/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDAO.Compra;

import ClasesAuxiliares.Producto;
import FamiliaOperacion.Compra;
import PatronSingleton.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Luis A. Sarango-Parrales
 */
public class CompraDAOImpl implements ICompraDAO {

    private final Conexion conexionMySql = Conexion.getInstancia();
    private final Connection connection = conexionMySql.getConnection();
    private CallableStatement cs, cs2;
    private PreparedStatement ps;
    private ResultSet rs, rs2;
    private Compra compra;
    private ArrayList<Compra> compras;
    public static ObservableList<Compra> listPendientes = FXCollections.observableArrayList();

    @Override
    public void create(Compra compra) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> readPendientes(int matricula, String tipo) throws Exception {
        compras = new ArrayList<>();

        cs = connection.prepareCall("{CALL readComprasPendientes(?, ?)}");
        cs.setInt(1, matricula);
        cs.setString(2, tipo);
        rs = cs.executeQuery();

        while (rs.next()) {
            compra = new Compra();

            Timestamp fechaHora = (Timestamp) rs.getObject("FechaHora");

            int idCompraVenta = rs.getInt("idCompraVenta");
            double montoTotal = rs.getDouble("MontoTotal");
            compra.setFechaHora(fechaHora.toLocalDateTime());
            compra.setIdCompra(idCompraVenta);
            compra.setMontoTotal(montoTotal);

            if (tipo.equals("Compra")) {
                int idVendedor = rs.getInt("idPerson1");
                compra.setIdVendedor(idVendedor);
            } else if (tipo.equals("Venta")) {
                int idComprador = rs.getInt("idPerson2");
                compra.setIdVendedor(idComprador);
            }
            compras.add(compra);
            listPendientes.add(compra);

        }
        cs.close();

        return compras;
    }

}
