/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ADMIN
 */
public class OrderProduct {

    private int idOrder;
    private int idProduct;
    private int cantityProduct;

    public OrderProduct() {
    }

    public OrderProduct(int idOrder, int idProduct, int cantityProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.cantityProduct = cantityProduct;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getCantityProduct() {
        return cantityProduct;
    }

    public void setCantityProduct(int cantityProduct) {
        this.cantityProduct = cantityProduct;
    }

    @Override
    public String toString() {
        return "OrderProduct{" + "idOrder=" + idOrder + ", idProduct=" + idProduct + ", cantityProduct=" + cantityProduct + '}';
    }

}
