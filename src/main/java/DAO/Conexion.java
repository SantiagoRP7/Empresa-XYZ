/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import excepciones.DBConexionExcepcion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juancamilo
 */
public class Conexion {

    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/testjava";

    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "Juanito7575"; //Cambiar despues

    public static Connection conexion;

    public Conexion() {
        this.conexion = null;
    }
    
    public static Connection getConnection() throws DBConexionExcepcion {    
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Conectar La Base de datos", ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Clase No encontrada", ex);
        }
    }
    
    public static void close(ResultSet rs) throws DBConexionExcepcion {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Cerrar La Base De Datos", ex);
        }
    }
    
    public static void close(Statement smtm) throws DBConexionExcepcion {
        try {
            smtm.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Cerrar El Stament De La Base De Datos", ex);
        }
    }
    
    public static void close(PreparedStatement smtm) throws DBConexionExcepcion {
        try {
            smtm.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Cerrar El PreparedStatement De La Base De Datos", ex);
        }
    }
    
    public static void close(Connection conn) throws DBConexionExcepcion {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Cerrar El Connection De La Base De Datos", ex);
        }
    }
}
