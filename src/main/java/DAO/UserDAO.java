/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static DAO.Conexion.*;
import excepciones.DBConexionExcepcion;
import modelo.User;

/**
 *
 * @author juancamilo
 */
public class UserDAO {

    private static final String SQL_LOGIN = "Select * from users where username= ? and password = ?";
    private static final String SQL_CHECK = "Select * from users where username= ?";
    private static final String SQL_INSERT = "INSERT into users(username, firstname, lastname, password, telefono) VALUES(?,?,?,?,?)";

    public UserDAO() {

    }

    public boolean login(String username, String password) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_LOGIN);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Logear El Usuario", ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return false;
    }

    public boolean comprobarUserName(String username) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_CHECK);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Comprobar El Nombre De Usuario", ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return false;

    }

    public boolean registrarUsuario(User user) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getFirstName());
            stmt.setString(3, user.getLastName());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getTelefono());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Registrar El Usuario", ex);
        } 
        finally {
            close(stmt);
            close(conn);

        }
        return registros==1;
    }

}
