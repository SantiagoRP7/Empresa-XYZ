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
            String cli[] = {String.valueOf(order.getIdOrder()), order.getDateOrder().toString(), String.valueOf(order.getIdClient())};
            ordersReturn.add(cli);
        });
        return ordersReturn;
    }
    
    public int createOrder(int idClient) {
        Order order = new Order((java.sql.Date) new Date(), idClient);
        if(orderDao.insertar(order)){
            return order.getIdOrder();
        }
        return -1;
    }
}
