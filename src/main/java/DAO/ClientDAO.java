/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Client;
import static DAO.Conexion.*;

/**
 *
 * @author juancamilo
 */
public class ClientDAO {

    private static final String SQL_SELECT = "Select * from client";
    private static final String SQL_INSERT = "Insert into client(firstName, lastName, email, phone) VALUES (?,?,?,?)";
    private static final String SQL_SELECT_ID = "Select idClient, firstName, lastName from client where idClient=?";
    
    public ClientDAO() {

    }
    

    public List<Client> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Client client = null;
        List<Client> clients = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idClient = rs.getInt("idClient");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                client = new Client(idClient, firstName, lastName, email, phone);
                clients.add(client);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

        return clients;
    }
    
    
    public boolean insertar(Client client) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, client.getFirstName());
            stmt.setString(2, client.getLastName());
            stmt.setString(3, client.getEmail());
            stmt.setString(4, client.getPhone());
            registros = stmt.executeUpdate();
            return registros == 1;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(stmt);
            close(conn);

        }

        return false;
    }
    
    public Client selectClientById(int idCli) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Client client = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, idCli);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                int idClient = rs.getInt("idClient");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                client = new Client(idClient);
                client.setFirstName(firstName);
                client.setLastName(lastName);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return client;
    }
}
