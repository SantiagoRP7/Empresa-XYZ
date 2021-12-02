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
import excepciones.DBConexionExcepcion;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Client;
import modelo.Order;
import modelo.OrderProduct;
import modelo.Product;
import reports.ReportPDF;

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
        String columnsProductsOrder[] = {"Código del producto", "Nombre", "Descripcion", "Precio und", "Cantidad", "Precio total"};
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
        btnEliminarprodpedido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 128, 244));
        jLabel1.setText("Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setText("Digite el código del cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        idClientTf.setBorder(null);
        jPanel1.add(idClientTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        loadClientBtn.setBackground(new java.awt.Color(153, 102, 255));
        loadClientBtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        loadClientBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\refresh.png")); // NOI18N
        loadClientBtn.setText("Cargar");
        loadClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadClientBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loadClientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setText("Código del cliente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        jPanel1.add(idClientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 56, 14));
        jPanel1.add(nameClientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 14));

        addProductBtn.setBackground(new java.awt.Color(51, 153, 255));
        addProductBtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        addProductBtn.setForeground(new java.awt.Color(255, 255, 255));
        addProductBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\anadir.png")); // NOI18N
        addProductBtn.setText("Añadir");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setText("Digite el código del producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel6.setText("Digite la cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 160, 90, -1));

        cantityProductTf.setBorder(null);
        cantityProductTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantityProductTfActionPerformed(evt);
            }
        });
        jPanel1.add(cantityProductTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, -1));

        idProductTf.setBorder(null);
        jPanel1.add(idProductTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));

        tableCreateOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCreateOrder);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 247, 460, 200));

        createOrderBtn.setBackground(new java.awt.Color(51, 153, 255));
        createOrderBtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        createOrderBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\agregar-paquete.png")); // NOI18N
        createOrderBtn.setText("Crear");
        createOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 120, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel7.setText("Total del pedido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        totalOrderLbl.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPanel1.add(totalOrderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 80, 23));

        backBtn.setBackground(new java.awt.Color(67, 35, 248));
        backBtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\cancelar.png")); // NOI18N
        backBtn.setText("Cancelar");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 120, -1));

        btnEliminarprodpedido.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarprodpedido.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnEliminarprodpedido.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\eliminar 24px.png")); // NOI18N
        btnEliminarprodpedido.setText("Eliminar");
        btnEliminarprodpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarprodpedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarprodpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 335, 120, -1));

        jPanel2.setBackground(new java.awt.Color(0, 128, 244));
        jPanel2.setForeground(new java.awt.Color(0, 128, 244));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 680, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Digite el código del cliente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int idCli = Integer.parseInt(idCliStr);
                Client client = controladorClient.selectClientById(idCli);
                idClientLbl.setText(String.valueOf(client.getIdClient()));
                nameClientLbl.setText(client.getFullName());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El código del cliente debe ser numérico", "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No existe el cliente con el id "+ idCliStr, "Error", JOptionPane.ERROR_MESSAGE);
            } catch (DBConexionExcepcion ex) {
                Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loadClientBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        // TODO add your handling code here:
        String idProdStr = idProductTf.getText();
        String cantStr = cantityProductTf.getText();

        if (idProdStr.length() == 0 || cantStr.length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el código del producto y la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "El código del producto y la cantidad deben ser valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No existe el producto con el id "+ idProdStr, "Error", JOptionPane.ERROR_MESSAGE);
            } catch (DBConexionExcepcion ex) {
                Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
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
            int idOrder = 0;
            try {
                idOrder = controladorOrder.getLastOrderId();
            } catch (DBConexionExcepcion ex) {
                Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean created = false;
            try {
                created = controladorOrder.createOrder(idClient, idOrder);
            } catch (DBConexionExcepcion ex) {
                Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (created) {
                for (int i = 0; i < orderProducts.size(); i++) {
                    orderProducts.get(i).setIdOrder(new Order(idOrder));
                }
                try {
                    controladorOrderProduct.createOrderProduct(orderProducts);
                } catch (DBConexionExcepcion ex) {
                    Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Pedido creado con exito");
                ReportPDF report = new ReportPDF();
                try {
                    report.generatePDF(idOrder);
                } catch (DBConexionExcepcion ex) {
                    Logger.getLogger(FormOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                mdProductsOrder.setRowCount(0);
                orderProducts.clear();
                totalOrderLbl.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear el pedido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_createOrderBtnActionPerformed

    private void btnEliminarprodpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarprodpedidoActionPerformed
        // TODO add your handling code here:
        try {
            int selected = tableCreateOrder.getSelectedRow();          
            tableCreateOrder.getModel();
            String CantStr = tableCreateOrder.getModel().getValueAt(selected, 5).toString();
            mdProductsOrder.removeRow(tableCreateOrder.getSelectedRow());
            
            //String idOrderStr = tableCreateOrder.getModel().getValueAt(selected, 0).toString();
            //String CantStr = tableCreateOrder.getModel().getValueAt(selected, 4).toString();
            //String CantStr = tableCreateOrder.getModel().getValueAt(selected, 5).toString();
            //int idOrder = Integer.parseInt(idOrderStr);
            //int cant = Integer.parseInt(CantStr);
            double precio_subs = Double.parseDouble(CantStr);
            //Product product = controladorProduct.selectProductById(idOrder);
            //double priceAct = product.getPrice();
            //double priceTact = priceAct * cant;

            this.priceTotal -= precio_subs;

            totalOrderLbl.setText(String.valueOf(priceTotal));
            
            orderProducts.remove(selected);
            
           
        } catch (Exception e) {  //ArrayIndexOutOfBoundsException e
            //JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarprodpedidoActionPerformed

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
    public javax.swing.JButton btnEliminarprodpedido;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton loadClientBtn;
    private javax.swing.JLabel nameClientLbl;
    private javax.swing.JTable tableCreateOrder;
    private javax.swing.JLabel totalOrderLbl;
    // End of variables declaration//GEN-END:variables
}
