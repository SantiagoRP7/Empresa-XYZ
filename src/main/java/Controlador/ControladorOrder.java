/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.OrderDAO;
import java.util.*;
import modelo.Client;
import modelo.Order;

/**
 *
 * @author juancamilo
 */
public class ControladorOrder {
    OrderDAO orderDao;

    public ControladorOrder() {
        orderDao = new OrderDAO();
    }
    
    public List<String[]> selectOrders() {
        List<Order> orders = orderDao.seleccionar();
        List<String[]> ordersReturn = new ArrayList<>();
        orders.forEach( order -> {
            String cli[] = {String.valueOf(order.getIdOrder()), order.getDateOrder().toString(), order.getIdClient().toString()};
            ordersReturn.add(cli);
        });
        return ordersReturn;
    }
    
    public boolean createOrder(Client idClient) {
        Order order = new Order((java.sql.Date) new Date(), idClient);
        return orderDao.insertar(order);
    }
}
