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

    private Order idOrder;
    private Product idProduct;
    private int cantityProduct;

    public OrderProduct() {
    }

    public OrderProduct(Order idOrder, Product idProduct, int cantityProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.cantityProduct = cantityProduct;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
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
