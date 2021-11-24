
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
    private Date dateOrder;
    private Client idClient;
    private User worker;
    public Order() {
    }

    public Order(User worker,int idOrder, Date dateOrder, Client idClient) {
        this.idOrder = idOrder;
        this.dateOrder = dateOrder;
        this.idClient = idClient;
        this.worker = worker;
    }

    public Order(Date dateOrder, Client idClient) {
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

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }
    
    public User getWorker() {
        return worker;
    }

    public void setIdClient(User worker) {
        this.worker = worker;
    }
}
