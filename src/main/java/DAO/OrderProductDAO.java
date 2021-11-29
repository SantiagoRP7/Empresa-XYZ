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
                int idOrder = rs.getInt("idOrder");
                int idProduct = rs.getInt("idProduct");
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
            stmt.setInt(1, orderProduct.getIdOrder());
            stmt.setInt(2, orderProduct.getIdProduct());
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

    
    
}
