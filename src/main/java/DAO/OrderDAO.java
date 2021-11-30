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
    private static String SQL_SELECT = "SELECT * FROM orders natural join client";
    private static String SQL_SELECT_ID_LAST = "SELECT max(idOrder) FROM orders";
    private static String SQL_SELECT_ID = "SELECT * FROM orders natural join client where idOrder=?";

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
                Client client = new Client(rs.getInt("idClient"));
                client.setFirstName(rs.getString("firstName"));
                client.setLastName(rs.getString("lastName"));
                User worker = new User(idOrder);
                order = new Order(worker, idOrder, dateOrder, client);
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
            stmt.setInt(3, order.getIdClient().getIdClient());
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
    
    public Order selectOrderById(int idCli) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Order order = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, idCli);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int idOrder = rs.getInt("idOrder");
                Date dateOrder = rs.getDate("dateOrder");
                Client cli = new Client(rs.getInt("idClient"));
                cli.setFirstName(rs.getString("firstName"));
                cli.setLastName(rs.getString("lastName"));
                order = new Order(idOrder, dateOrder, cli);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return order;
    }
}
