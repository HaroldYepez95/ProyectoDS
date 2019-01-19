/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Harold
 */
public class Comprador extends Estudiante{
    private int idComprador;
    private Double saldoDisponible;
    private CompraSaldo compraSaldo;
    private ArrayList<Producto> misProductos;

    public Comprador(int idComprador, Double saldoDisponible, CompraSaldo compraSaldo, ArrayList<Producto> misProductos, int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
        this.idComprador = idComprador;
        this.saldoDisponible = saldoDisponible;
        this.compraSaldo = compraSaldo;
        this.misProductos = misProductos;
    }

    public Comprador(int matricula, String usuario, String contraseña, String rol, String cedula, String nombres, String apellidos, boolean tieneWhatsApp, String telefonoActual, ArrayList<String> correos, ArrayList<String> domicilios, ArrayList<String> telefonosSecundarios) {
        super(matricula, usuario, contraseña, rol, cedula, nombres, apellidos, tieneWhatsApp, telefonoActual, correos, domicilios, telefonosSecundarios);
    }

    

    
    
    
}
