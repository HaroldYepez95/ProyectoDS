/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatronDAO.Producto;

import ClasesAuxiliares.Producto;
import PatronSingleton.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * 
 * @author Luis A. Sarango-Parrales
 */
public class ProductoDAOImpl implements IProductoDAO {
    private final Conexion conexionMySql = Conexion.getInstancia();
    private final Connection connection = conexionMySql.getConnection();
    private CallableStatement cs, cs2;
    private PreparedStatement ps;
    private ResultSet rs, rs2;
    private Producto articulo;
    private ArrayList<Producto> articulos;

    @Override
    public void create(Producto producto) throws Exception {
        cs = connection.prepareCall("{CALL createProducto(?, ?, ?)}");
        
        cs.setInt(1, producto.getIdProvider());
        cs.setString(2, producto.getNombre());
        cs.setDouble(3, producto.getPrecioUnitario());
        cs.setString(4, producto.getCategoria());
        cs.setString(5, producto.getDescripcion());
        cs.setInt(5, producto.getCantidadDisponible());
        cs.setObject(6, producto.getTiempoMaxEntrega());
        cs.setInt(7, producto.getCalificacionPromedioProducto());
        cs.setInt(8, producto.getNroBusquedas());
        cs.setObject(9, producto.getFechaIngreso());
   
        cs.executeQuery();
        cs.close();
    }

    
    @Override
    public ArrayList<Producto> read() throws Exception {
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
    public ArrayList<Producto> readMasBuscados() throws Exception {
        cs = connection.prepareCall("{CALL readProductosMasBuscados()}");
        rs = cs.executeQuery();
        articulos=new ArrayList<>();
        while (rs.next()) {
            articulo=new Producto();
            int cantidadDisponible=rs.getInt("CantidadDisponible"),
                nroBusquedas=rs.getInt("NroBusquedas"),
                calificacionPromedioVendedor=rs.getInt("CalificacionPromedioVendedor"),
                calificacionPromedioProducto= rs.getInt("CalificacionPromedioProducto");
            double precioUnitario=rs.getDouble("PrecioUnitario");
            String nombre=rs.getString("Nombre"),
                   categoria=rs.getString("Categoria"),
                   descripcion=rs.getString("Descripcion");
            Timestamp tiempoMaxEntrega=(Timestamp)rs.getObject("TiempoMaxEntrega");
            Date fechaIngreso=(Date)rs.getObject("FechaIngreso");
            
            articulo.setNombre(nombre);
            articulo.setCalificacionPromedioProducto(calificacionPromedioProducto);
            articulo.setNroBusquedas(nroBusquedas);
            articulo.setCantidadDisponible(cantidadDisponible);
            articulo.setPrecioUnitario(precioUnitario);
            articulo.setCategoria(categoria);
            articulo.setDescripcion(descripcion);
            articulo.setTiempoMaxEntrega(LocalTime.parse(tiempoMaxEntrega.toString()));
            articulo.setFechaIngreso(fechaIngreso.toLocalDate());
            articulo.setCalificacionPromedioVendedor(calificacionPromedioVendedor);
            
 
            articulos.add(articulo);
        }
        cs.close();
        return articulos;
    }

    @Override
    public ArrayList<Producto> readMisProductos(int matricula) throws Exception {
        cs = connection.prepareCall("{CALL readMisProductos(?)}");
        cs.setInt(1, matricula);
        rs = cs.executeQuery();
        articulos=new ArrayList<>();
        while (rs.next()) {
            articulo=new Producto();
            int cantidadDisponible=rs.getInt("CantidadDisponible"),
                nroBusquedas=rs.getInt("NroBusquedas"),
                calificacionPromedioProducto= rs.getInt("CalificacionPromedioProducto");
            double precioUnitario=rs.getDouble("PrecioUnitario");
            String nombre=rs.getString("Nombre"),
                   categoria=rs.getString("Categoria"),
                   descripcion=rs.getString("Descripcion");
            Time tiempoMaxEntrega=(Time)rs.getObject("TiempoMaxEntrega");
            Date fechaIngreso=(Date)rs.getObject("FechaIngreso");
            
            articulo.setNombre(nombre);
            articulo.setCalificacionPromedioProducto(calificacionPromedioProducto);
            articulo.setNroBusquedas(nroBusquedas);
            articulo.setCantidadDisponible(cantidadDisponible);
            articulo.setPrecioUnitario(precioUnitario);
            articulo.setCategoria(categoria);
            articulo.setDescripcion(descripcion);
            articulo.setTiempoMaxEntrega(LocalTime.parse(tiempoMaxEntrega.toString()));
            articulo.setFechaIngreso(fechaIngreso.toLocalDate());
            
            articulos.add(articulo);
        }
        cs.close();
        return articulos;
    }

    @Override
    public ArrayList<Producto> busquedaSencillaNombre(String nombreProducto) throws Exception {
        articulos= new ArrayList<>();
        cs = connection.prepareCall("{CALL readProductoNombre(?)}");
        cs.setString(1,nombreProducto);
        rs = cs.executeQuery();
  
      
        while (rs.next()) {
            articulo=new Producto();
            int cantidadDisponible=rs.getInt("CantidadDisponible"),
                nroBusquedas=rs.getInt("NroBusquedas"),
                calificacionPromedioProducto= rs.getInt("CalificacionPromedioProducto"),
                calificacionPromedioVendedor= rs.getInt("CalificacionPromedioVendedor");
            double precioUnitario=rs.getDouble("PrecioUnitario");
            String nombre=rs.getString("Nombre"),
                   categoria=rs.getString("Categoria"),
                   descripcion=rs.getString("Descripcion");
            Time tiempoMaxEntrega=(Time)rs.getObject("TiempoMaxEntrega");
            Date fechaIngreso=(Date)rs.getObject("FechaIngreso");
            
            articulo.setNombre(nombre);
            articulo.setCalificacionPromedioProducto(calificacionPromedioProducto);
            articulo.setCalificacionPromedioVendedor(calificacionPromedioVendedor);
            articulo.setNroBusquedas(nroBusquedas);
            articulo.setCantidadDisponible(cantidadDisponible);
            articulo.setPrecioUnitario(precioUnitario);
            articulo.setCategoria(categoria);
            articulo.setDescripcion(descripcion);
            articulo.setTiempoMaxEntrega(LocalTime.parse(tiempoMaxEntrega.toString()));
            articulo.setFechaIngreso(fechaIngreso.toLocalDate());
            
            articulos.add(articulo);
        }
        cs.close();
        return articulos;
        
        
        
    }

    @Override
    public ArrayList<Producto> busquedaSencillaDescripcion(String descripcionProducto) throws Exception {
        articulos= new ArrayList<>();
        cs = connection.prepareCall("{CALL readProductoDescripcion(?)}");
        cs.setString(1,descripcionProducto);
        rs = cs.executeQuery();
  
      
        while (rs.next()) {
            articulo=new Producto();
            int cantidadDisponible=rs.getInt("CantidadDisponible"),
                nroBusquedas=rs.getInt("NroBusquedas"),
                calificacionPromedioProducto= rs.getInt("CalificacionPromedioProducto"),
                calificacionPromedioVendedor= rs.getInt("CalificacionPromedioVendedor");
            double precioUnitario=rs.getDouble("PrecioUnitario");
            String nombre=rs.getString("Nombre"),
                   categoria=rs.getString("Categoria"),
                   descripcion=rs.getString("Descripcion");
            Time tiempoMaxEntrega=(Time)rs.getObject("TiempoMaxEntrega");
            Date fechaIngreso=(Date)rs.getObject("FechaIngreso");
            
            articulo.setNombre(nombre);
            articulo.setCalificacionPromedioProducto(calificacionPromedioProducto);
            articulo.setCalificacionPromedioVendedor(calificacionPromedioVendedor);
            articulo.setNroBusquedas(nroBusquedas);
            articulo.setCantidadDisponible(cantidadDisponible);
            articulo.setPrecioUnitario(precioUnitario);
            articulo.setCategoria(categoria);
            articulo.setDescripcion(descripcion);
            articulo.setTiempoMaxEntrega(LocalTime.parse(tiempoMaxEntrega.toString()));
            articulo.setFechaIngreso(fechaIngreso.toLocalDate());
            
            articulos.add(articulo);
        }
        cs.close();
        return articulos;
        
    }


   

}
