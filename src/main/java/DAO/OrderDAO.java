/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.*;
import modelo.*;
import static DAO.Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

/**
 *
 * @author juancamilo
 */
public class OrderDAO {
    private static String SQL_INSERT = "INSERT INTO orders (dateOrder, idClient) VALUES (?, ?)";
    private static String SQL_SELECT = "SELECT * FROM orders";

    public OrderDAO() {
    }
    
    public List<Order> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Order order = null;
        List<Order> orders = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idOrder = rs.getInt("idOrder");
                Date dateOrder = rs.getDate("dateOrder");
                Client idClient = new Client(rs.getInt("idClient"));
                order = new Order(idOrder, dateOrder, idClient);
                orders.add(order);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

        return orders;
    }
    
    public boolean insertar(Order order) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setDate(1, order.getDateOrder());
            stmt.setInt(2, order.getIdClient().getIdClient());
            registros = stmt.executeUpdate();
            return registros == 1;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(stmt);
            close(conn);

        }

        return false;
    }
}
