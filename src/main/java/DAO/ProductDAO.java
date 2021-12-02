/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import modelo.Product;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static DAO.Conexion.*;
import excepciones.DBConexionExcepcion;

/**
 *
 * @author juancamilo
 */
public class ProductDAO {

    private static final String SQL_SELECT = "Select * from product";
    private static final String SQL_INSERT = "Insert into product(name, description, price) VALUES (?,?,?)";
    private static final String SQL_SELECT_ID = "Select * from product where idProduct=?";
     private static final String SQL_MODIFY = "update product set name=?, description=?, price=? where idproduct=?";
     
       public boolean Modificar(Product product) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_MODIFY);   
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            stmt.setInt(4, product.getIdProduct());
            registros = stmt.executeUpdate();
            

        } catch (Exception e) {
            throw new DBConexionExcepcion("Error Al Modificar El Producto", e);
        } finally {
            close(stmt);
            close(conn);
        }return registros == 1 ;
        
    }
    

    public List<Product> seleccionar() throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Product product = null;
        List<Product> products = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idProduct = rs.getInt("idProduct");
                String name = rs.getString("name");
                String description = rs.getString("description");
                Double price = rs.getDouble("price");
                product = new Product(idProduct, name, description, price);
                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Selecionar El Producto", ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

        return products;
    }

    public boolean insertar(Product product) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            registros = stmt.executeUpdate();
            return registros == 1;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Insertar El Producto", ex);
        } finally {
            close(stmt);
            close(conn);

        }
    }

    public Product selectProductById(int idCli) throws DBConexionExcepcion {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Product product = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, idCli);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int idProduct = rs.getInt("idProduct");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                product = new Product(idProduct, name, description, price);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            throw new DBConexionExcepcion("Error Al Selecionar El Producto", ex);
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }
        return product;
    }
}
