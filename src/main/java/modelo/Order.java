
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author juancamilo
 */
public class Order {

    private int idOrder;
    private static int countOrder;
    private Date dateOrder;
    private int idClient;
    private User worker;
    public Order() {
        this.idOrder = ++Order.countOrder;
    }

    public Order(User worker,int idOrder, Date dateOrder, int idClient) {
        this.idOrder = idOrder;
        this.dateOrder = dateOrder;
        this.idClient = idClient;
        this.worker = worker;
    }

    public Order(Date dateOrder, int idClient) {
        this();
        this.dateOrder = dateOrder;
        this.idClient = idClient;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
    public User getWorker() {
        return worker;
    }

    public void setIdClient(User worker) {
        this.worker = worker;
    }
}
