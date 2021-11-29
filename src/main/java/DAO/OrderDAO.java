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
import org.postgresql.util.PSQLException;

/**
 *
 * @author juancamilo
 */
public class OrderDAO {

    private static String SQL_INSERT = "INSERT INTO orders (idOrder, dateOrder, idClient) VALUES (?, ?, ?)";
    private static String SQL_SELECT = "SELECT * FROM orders";
    private static String SQL_SELECT_ID_LAST = "SELECT max(idOrder) FROM orders";

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
                int idClient = rs.getInt("idClient");
                User worker = new User(idOrder);
                order = new Order(worker, idOrder, dateOrder, idClient);
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
            stmt.setInt(1, order.getIdOrder());
            stmt.setDate(2, order.getDateOrder());
            stmt.setInt(3, order.getIdClient());
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

    public int lastOrderId() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int lastOrderId = 1;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID_LAST);
            rs = stmt.executeQuery();

            if (rs.next()) {
                lastOrderId = rs.getInt("max");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

        return lastOrderId+1;
    }
}
