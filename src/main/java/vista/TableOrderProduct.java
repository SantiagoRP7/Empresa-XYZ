/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Controlador.ControladorOrderProduct;
import Controlador.ControladorOrder;
import excepciones.DBConexionExcepcion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Order;
import reports.ReportPDF;

/**
 *
 * @author juancamilo
 */
public class TableOrderProduct extends javax.swing.JFrame {

    ControladorOrderProduct controladorOrderProduct;
    ControladorOrder controladorOrder;
    DefaultTableModel mdOderProductTable;

    /**
     * Creates new form TableOrderProduct
     */
    public TableOrderProduct(int idOrder) throws DBConexionExcepcion {
        initComponents();
        controladorOrderProduct = new ControladorOrderProduct();
        controladorOrder = new ControladorOrder();
        String data[][] = {};
        String columnsOrderProduct[] = {"Id product", "Nombre", "Descripcion", "Precio", "Cantidad", "Precio total"};
        mdOderProductTable = new DefaultTableModel(data, columnsOrderProduct);
        orderProductsTable.setModel(mdOderProductTable);
        orderProductsTable.setDefaultEditor(Object.class, null);
        loadOrderProductsTable(idOrder);
        setLabels(idOrder);
        //inocente comentario de prueba
        System.out.println("inocente prueba");
        System.out.println("prueba inocente");
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
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        printOrderBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalPriceOrderLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderProductsTable = new javax.swing.JTable();
        dateOrderLbl = new javax.swing.JLabel();
        idOrdenLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameClientLbl = new javax.swing.JLabel();
        idClientLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(67, 35, 248));
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\atras 16px.png")); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        printOrderBtn.setBackground(new java.awt.Color(255, 102, 102));
        printOrderBtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        printOrderBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\pdf.png")); // NOI18N
        printOrderBtn.setText("Imprimir");
        printOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOrderBtnActionPerformed(evt);
            }
        });
        jPanel2.add(printOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel6.setText("Total a pagar:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        totalPriceOrderLbl.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        totalPriceOrderLbl.setText("jLabel7");
        jPanel2.add(totalPriceOrderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 128, 244));
        jLabel7.setText("Detalles del pedido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 128, 244));
        jPanel3.setForeground(new java.awt.Color(0, 128, 244));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 680, 30));

        orderProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(orderProductsTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 490, 190));
        jPanel2.add(dateOrderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 97, 21));
        jPanel2.add(idOrdenLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 65, 17));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setText("Fecha pedido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 21));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setText("Id pedido:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setText("Código del cliente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 21));
        jPanel2.add(nameClientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 165, 21));
        jPanel2.add(idClientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 73, 17));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 70, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 155, 170, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 70, 20));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 155, 100, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOrderBtnActionPerformed
        // TODO add your handling code here:
        int idOrder = Integer.parseInt(idOrdenLbl.getText());
        ReportPDF report = new ReportPDF();
        try {
            report.generatePDF(idOrder);
        } catch (DBConexionExcepcion ex) {
            Logger.getLogger(TableOrderProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printOrderBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void loadOrderProductsTable(int idOrder) throws DBConexionExcepcion {
        mdOderProductTable.setRowCount(0); //de esta forma vaciamos la tabla
        List<String[]> orderProducts = controladorOrderProduct.selectProductsById(idOrder);
        orderProducts.forEach(orderProduct -> {
            mdOderProductTable.addRow(orderProduct);
        });
        totalPriceOrder();
    }

    private void setLabels(int idOrder) throws DBConexionExcepcion {
        Order order = controladorOrder.selectOrderById(idOrder);
        idOrdenLbl.setText(String.valueOf(order.getIdOrder()));
        dateOrderLbl.setText(String.valueOf(order.getDateOrder()));
        idClientLbl.setText(String.valueOf(order.getIdClient().getIdClient()));
        nameClientLbl.setText(String.valueOf(order.getIdClient().getFullName()));
    }

    private void totalPriceOrder() {
        double total = 0;
        for (int i = 0; i < orderProductsTable.getRowCount(); i++) {
            total += Double.parseDouble(orderProductsTable.getModel().getValueAt(i, 5).toString());
        }
        totalPriceOrderLbl.setText(String.valueOf(total));
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TableOrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TableOrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TableOrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TableOrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TableOrderProduct().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel dateOrderLbl;
    private javax.swing.JLabel idClientLbl;
    private javax.swing.JLabel idOrdenLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nameClientLbl;
    private javax.swing.JTable orderProductsTable;
    private javax.swing.JButton printOrderBtn;
    private javax.swing.JLabel totalPriceOrderLbl;
    // End of variables declaration//GEN-END:variables
}
