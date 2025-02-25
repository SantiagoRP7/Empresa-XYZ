/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import Controlador.ControladorEncode;
import Controlador.ControladorUser;
import excepciones.DBConexionExcepcion;
import excepciones.DiferentPasswords;
import excepciones.InvalidLastName;
import excepciones.InvalidName;
import excepciones.RegexStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.User;

/**
 *
 * @author gabri
 */
public class FormRegister extends javax.swing.JFrame {

    /**
     * Creates new form FormRegister
     */
    public FormRegister() {
        initComponents();
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefonoTextField = new javax.swing.JTextField();
        confirmarContrasenaTextField = new javax.swing.JTextField();
        contrasenaTextField = new javax.swing.JTextField();
        usuarioTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel3.setText("Nombre de usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel9.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 28));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 60, -1));

        telefonoTextField.setBorder(null);
        telefonoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(telefonoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 180, 20));

        confirmarContrasenaTextField.setBorder(null);
        jPanel1.add(confirmarContrasenaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 180, -1));

        contrasenaTextField.setBorder(null);
        jPanel1.add(contrasenaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 20));

        usuarioTextField.setBorder(null);
        jPanel1.add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 20));

        apellidoTextField.setBorder(null);
        apellidoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, 20));

        nombreTextField.setBorder(null);
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 20));

        jLabel1.setBackground(new java.awt.Color(0, 128, 244));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 128, 244));
        jLabel1.setText("Formulario de registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 50));

        jButton1.setBackground(new java.awt.Color(67, 35, 248));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel10.setText("Nombres:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 180, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 180, 10));

        jPanel2.setBackground(new java.awt.Color(0, 128, 244));
        jPanel2.setForeground(new java.awt.Color(0, 128, 244));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void apellidoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ControladorEncode codificar = new ControladorEncode();
        ControladorUser controlUser = new ControladorUser();
        String contrasena = contrasenaTextField.getText();
        String contrasenaConfirmar = confirmarContrasenaTextField.getText();
        if (contrasena.equals(contrasenaConfirmar)) {

            String usuario = usuarioTextField.getText();
            if (usuario.matches(RegexStatement.RegexUserName)) {
                try {
                    if (controlUser.usuarioExistente(usuario)) {
                        JOptionPane.showMessageDialog(null, "el nombre de usuario ya está registrado, por favor seleccione otro");
                    } else {
                        String nombre = nombreTextField.getText();
                        if (nombre.matches(RegexStatement.RegexName)) {
                            String apellido = apellidoTextField.getText();
                            if (apellido.matches(RegexStatement.RegexName)) {
                                String contrasenaCodificada = codificar.codificar(contrasena);
                                String telefono = telefonoTextField.getText();
                                User user = new User(usuario, nombre, apellido, contrasenaCodificada, telefono);
                                controlUser.registrarUsuario(user);
                                JOptionPane.showMessageDialog(null, "Registro realizado con éxito!.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Formato de apellido no válido");
                                throw new InvalidLastName("Apellido Invalido");
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Formato de nombre no válido");
                            throw new InvalidName("Nombre Invalido");
                        }

                    }
                } catch (DBConexionExcepcion ex) {
                    Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidLastName ex) {
                    Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidName ex) {
                    Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

                String nombre = nombreTextField.getText();
                String apellido = apellidoTextField.getText();
                String contrasenaCodificada = codificar.codificar(contrasena);
                String telefono = telefonoTextField.getText();
                User user = new User(usuario, nombre, apellido, contrasenaCodificada, telefono);
                try {
                    controlUser.registrarUsuario(user);
                } catch (DBConexionExcepcion ex) {
                    Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Registro realizado con éxito!.");
                this.setVisible(false);
                FormLogin menuLogin = new FormLogin();
                menuLogin.setVisible(true);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            try {
                throw new DiferentPasswords("Las contraseñas no coincide");
            } catch (DiferentPasswords ex) {
                Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setVisible(false);
        FormLogin login = new FormLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void telefonoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        FormLogin login = new FormLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JTextField confirmarContrasenaTextField;
    private javax.swing.JTextField contrasenaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
