/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.Conexion.close;
import static DAO.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Order;
import modelo.OrderProduct;
import modelo.Product;

/**
 *
 * @author ADMIN
 */
public class OrderProductDAO {
    private static final String SQL_SELECT = "Select * from orders_product";
    private static final String SQL_INSERT = "Insert into orders_product(idOrder, idProduct, cantityProduct) VALUES (?,?,?)";
    private static final String SQL_SELECT_ID = "Select * from orders_product where idOrder=?";
    private static final String SQL_JOIN = "Select * from product natural join orders_product natural join orders where idOrder=?";

    public List<OrderProduct> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        OrderProduct orderProduct = null;
        List<OrderProduct> orderProducts = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Order idOrder = new Order(rs.getInt("idOrder"));
                Product idProduct = new Product(rs.getInt("idProduct"));
                int cantityProduct = rs.getInt("cantityProduct");
                orderProduct = new OrderProduct(idOrder,idProduct,cantityProduct);
                orderProducts.add(orderProduct);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

        return orderProducts;
    }

    public boolean insertar(OrderProduct orderProduct) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, orderProduct.getIdOrder().getIdOrder());
            stmt.setInt(2, orderProduct.getIdProduct().getIdProduct());
            stmt.setInt(3, orderProduct.getCantityProduct());
            registros = stmt.executeUpdate();
            return registros == 1;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(stmt);
            close(conn);

        }

        return false;
    }
    
    public List<OrderProduct> selectOrderProductsById(int idOrd) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<OrderProduct> orderProducts = new ArrayList<>();
        OrderProduct orderProduct = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_JOIN);
            stmt.setInt(1, idOrd);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Product product = new Product(rs.getInt("idProduct"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                Order order = new Order(rs.getInt("idOrder"));
                order.setDateOrder(rs.getDate("dateOrder"));
                int cantity = rs.getInt("cantityproduct");
                orderProduct = new OrderProduct(order,product,cantity);
                orderProducts.add(orderProduct);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return orderProducts;
    }

    
    
}
