/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.table.DefaultTableModel;
import Controlador.ControladorClient;
import Controlador.ControladorOrder;
import Controlador.ControladorOrderProduct;
import Controlador.ControladorProduct;
import java.util.*;
import javax.swing.JOptionPane;
import modelo.Client;
import modelo.Order;
import modelo.OrderProduct;
import modelo.Product;

/**
 *
 * @author juancamilo
 */
public class FormOrder extends javax.swing.JFrame {

    ControladorClient controladorClient;
    ControladorProduct controladorProduct;
    DefaultTableModel mdProductsOrder;
    double priceTotal;
    ControladorOrder controladorOrder;
    ControladorOrderProduct controladorOrderProduct;
    ArrayList<OrderProduct> orderProducts;
    

    /**
     * Creates new form FormOrder
     */
    public FormOrder() {
        initComponents();
        controladorOrderProduct = new ControladorOrderProduct();
        controladorClient = new ControladorClient();
        controladorProduct = new ControladorProduct();
        controladorOrder = new ControladorOrder();
        String data[][] = {};
        String columnsProductsOrder[] = {"Id producto", "Nombre", "Descripcion", "Precio und", "Cantidad", "Precio total"};
        mdProductsOrder = new DefaultTableModel(data, columnsProductsOrder);
        tableCreateOrder.setModel(mdProductsOrder);
        tableCreateOrder.setDefaultEditor(Object.class, null);
        orderProducts = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idClientTf = new javax.swing.JTextField();
        loadClientBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idClientLbl = new javax.swing.JLabel();
        nameClientLbl = new javax.swing.JLabel();
        addProductBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantityProductTf = new javax.swing.JTextField();
        idProductTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCreateOrder = new javax.swing.JTable();
        createOrderBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalOrderLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos");

        jLabel2.setText("Escriba el id del cliente:");

        loadClientBtn.setText("Cargar");
        loadClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadClientBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Id Cliente:");

        addProductBtn.setText("Añadir");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Escriba el id del producto:");

        jLabel6.setText("Cantidad");

        cantityProductTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantityProductTfActionPerformed(evt);
            }
        });

        tableCreateOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCreateOrder);

        createOrderBtn.setText("Crear");
        createOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Total del pedido:");

        totalOrderLbl.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        backBtn.setText("Cancelar");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProductBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idClientTf, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(idProductTf)
                            .addComponent(cantityProductTf))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loadClientBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameClientLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(idClientLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(103, 103, 103))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(totalOrderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(backBtn)
                        .addGap(194, 194, 194)
                        .addComponent(createOrderBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(idClientTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadClientBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idClientLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameClientLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idProductTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantityProductTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductBtn)
                    .addComponent(jLabel7)
                    .addComponent(totalOrderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(createOrderBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantityProductTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantityProductTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantityProductTfActionPerformed

    private void loadClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadClientBtnActionPerformed
        // TODO add your handling code here:
        String idCliStr = idClientTf.getText();
        if (idCliStr.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe escribir el id del cliente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int idCli = Integer.parseInt(idCliStr);
                Client client = controladorClient.selectClientById(idCli);
                idClientLbl.setText(String.valueOf(client.getIdClient()));
                nameClientLbl.setText(client.getFullName());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El id del cliente debe ser numérico", "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No existe el cliente con el id "+ idCliStr, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loadClientBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        // TODO add your handling code here:
        String idProdStr = idProductTf.getText();
        String cantStr = cantityProductTf.getText();

        if (idProdStr.length() == 0 || cantStr.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe escribir el id del producto y la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {//{"Id producto", "Nombre", "Descripcion", "Precio und", "Cantidad", "Precio total"};
                int cant = Integer.parseInt(cantStr);
                int idProd = Integer.parseInt(idProdStr);
                Product product = controladorProduct.selectProductById(idProd);
                double price = product.getPrice();
                double priceT = price * cant;
                this.priceTotal += priceT;
                String prod[] = {idProdStr, product.getName(), product.getDescription(), String.valueOf(price), cantStr, String.valueOf(priceT)};
                OrderProduct temp = new OrderProduct();
                temp.setIdProduct(new Product(idProd));
                temp.setCantityProduct(cant);
                orderProducts.add(temp);
                mdProductsOrder.addRow(prod);
                totalOrderLbl.setText(String.valueOf(this.priceTotal));
                idProductTf.setText("");
                cantityProductTf.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El id del producto y la cantidad deben ser valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No existe el producto con el id "+ idProdStr, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_addProductBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void createOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderBtnActionPerformed
        // TODO add your handling code here:
        String idClientSTR = idClientLbl.getText(); 
        if(idClientSTR.length()==0){
            JOptionPane.showMessageDialog(null, "Porfavor ingresa el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int idClient = Integer.parseInt(idClientSTR);
            int idOrder = controladorOrder.getLastOrderId();
            boolean created = controladorOrder.createOrder(idClient, idOrder);
            if (created) {
                for (int i = 0; i < orderProducts.size(); i++) {
                    orderProducts.get(i).setIdOrder(new Order(idOrder));
                }
                controladorOrderProduct.createOrderProduct(orderProducts);
                JOptionPane.showMessageDialog(null, "Pedido creado con exito");
                mdProductsOrder.setRowCount(0);
                orderProducts.clear();
                totalOrderLbl.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear el pedido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_createOrderBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cantityProductTf;
    private javax.swing.JButton createOrderBtn;
    private javax.swing.JLabel idClientLbl;
    private javax.swing.JTextField idClientTf;
    private javax.swing.JTextField idProductTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadClientBtn;
    private javax.swing.JLabel nameClientLbl;
    private javax.swing.JTable tableCreateOrder;
    private javax.swing.JLabel totalOrderLbl;
    // End of variables declaration//GEN-END:variables
}
