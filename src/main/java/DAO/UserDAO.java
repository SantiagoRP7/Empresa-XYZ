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

/**
 *
 * @author juancamilo
 */
public class UserDAO {
    private static final String SQL_LOGIN = "Select * from users where username= ? and password = ?";

    public UserDAO() {
        // Do nothing - SonarLint        
    }
    
    public boolean login(String username, String password) {
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
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return false;
    }
    
}
