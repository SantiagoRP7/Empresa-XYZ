/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Controlador.ControladorEncode;
import Controlador.ControladorUser;
import javax.swing.JOptionPane;

/**
 *
 * @author juancamilo
 */
public class FormLogin extends javax.swing.JFrame {

    ControladorUser controladorUser;

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
        controladorUser = new ControladorUser();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        usernameTf = new javax.swing.JTextField();
        passwordTf = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registroButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTf.setBorder(null);
        usernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTfActionPerformed(evt);
            }
        });
        jPanel2.add(usernameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 190, 25));

        passwordTf.setBorder(null);
        jPanel2.add(passwordTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 190, 25));

        loginButton.setBackground(new java.awt.Color(51, 153, 255));
        loginButton.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Ingresar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        registroButton.setBackground(new java.awt.Color(51, 153, 255));
        registroButton.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        registroButton.setForeground(new java.awt.Color(255, 255, 255));
        registroButton.setText("Registro");
        registroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroButtonActionPerformed(evt);
            }
        });
        jPanel2.add(registroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jPanel1.setBackground(new java.awt.Color(218, 234, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\letra-x.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\letra-y.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\letra-z.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 290, 10));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setText("GESTIÓN DE PEDIDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 440));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 128, 244));
        jLabel4.setText("Iniciar Sesión");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 200, 50));

        lblNickname.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblNickname.setText("Usuario:");
        jPanel2.add(lblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 60, -1));

        lblPassword.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblPassword.setText("Contraseña:");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 90, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 240, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 240, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\usuario.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\Empresa-XYZ - ultimos cambios\\src\\main\\java\\imgs\\bloquear.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 128, 244));
        jPanel5.setForeground(new java.awt.Color(0, 128, 244));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // add your handling code here:
        String username = usernameTf.getText();
        ControladorEncode codificador= new ControladorEncode();
        String password = codificador.codificar(passwordTf.getText());
        boolean login = controladorUser.login(username, password);

        if (username.length() == 0 || password.length() == 0){
            JOptionPane.showMessageDialog(null, "Ingrese el usuario y la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (login) {
            this.dispose();
            VistaUser vu = new VistaUser();
            vu.setLocationRelativeTo(null);
            vu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error en el login", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTfActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_usernameTfActionPerformed

    private void registroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroButtonActionPerformed
        setVisible(false);
        FormRegister ventanaRegistro= new FormRegister();
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_registroButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JButton registroButton;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
