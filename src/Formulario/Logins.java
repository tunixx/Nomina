/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Basedato.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Developer
 */
public class Logins extends javax.swing.JFrame {
    private newMenu unMenu;
    private String usuario,clave;
    /**
     * Creates new form Logins
     */
    public Logins() {
        initComponents();
        //validar_ingreso();
    }

  public int validar_ingreso(){
        usuario = txtUsuario.getText();
        clave = String.valueOf(txtPasword2.getText());
      int resultado=0;
    
      System.out.println("User"+usuario +" y Clave "+clave);
    String SSQL="SELECT * FROM Usuario WHERE Usuario='"+usuario+"' AND Clave=('"+clave+"')";

    Connection conect = null;

    try {
        
        ConexionMySQL mysql = new ConexionMySQL ();
        conect = mysql.Conectar();
     
        Statement st = conect.createStatement();
        ResultSet rs = st.executeQuery(SSQL);
     
       if(rs.next()){

            resultado=1;

        }  
        

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{


        try {

            conect.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

        }

    }

return resultado;

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        jEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        txtPasword2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 250, 37));

        jEntrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jEntrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Documents\\NetBeansProjects\\Empleado_Ferreteria_Ruben\\imagenes\\login.png")); // NOI18N
        jEntrar.setText("Entrar");
        jEntrar.setContentAreaFilled(false);
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 148, 116, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Clave");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 255, 116, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Desktop\\user-login-icon-29.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        jSalir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Documents\\NetBeansProjects\\Empleado_Ferreteria_Ruben\\imagenes\\logout (1).png")); // NOI18N
        jSalir.setText("Salir");
        jSalir.setContentAreaFilled(false);
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        txtPasword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasword2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 250, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Desktop\\smooth-ice.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed
      
     
       if(validar_ingreso()==1){
                 
        this.dispose();

        JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
        + "satisfactoriamente al sistema", "Mensaje de bienvenida",
        JOptionPane.INFORMATION_MESSAGE);

        unMenu = new newMenu();          
        unMenu.setVisible(true);

        }else {
                    
        JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
        + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
        JOptionPane.ERROR_MESSAGE);
        
        }
       
       //this.dispose();
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void txtPasword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasword2ActionPerformed

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
            java.util.logging.Logger.getLogger(Logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jSalir;
    private javax.swing.JPasswordField txtPasword2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
