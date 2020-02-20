/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poke;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import controlador.conectar;

/**
 *
 * @author User
 */
public class registrarse extends javax.swing.JFrame {

   conexion cc=new conexion();
   Connection con=cc.con;
   
    public registrarse() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Entrenador Poke");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
       ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/picachu.gif"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setLocationRelativeTo(null);
    }
    public void agregarUser(){
        String pass = String.valueOf(txt_contra.getPassword());
        
        
        String sql= "INSERT INTO usuarios (nombre, apellido, user, contraseña) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,(txt_nomusu.getText()));
            pst.setString(2,(txt_apeusu.getText()));
            pst.setString(3,(txt_email.getText()));
            pst.setString(4, pass);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO" +e.getMessage());
        }
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nomusu = new javax.swing.JTextField();
        txt_apeusu = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        bt_regis = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        txt_contra = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\user2.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        txt_nomusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomusuActionPerformed(evt);
            }
        });

        bt_regis.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        bt_regis.setText("REGISTRARSE");
        bt_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regisActionPerformed(evt);
            }
        });

        bt_cancelar.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        bt_cancelar.setText("SALIR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txt_apeusu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomusu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_regis)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nomusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apeusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(bt_regis)
                .addGap(35, 35, 35)
                .addComponent(bt_cancelar)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomusuActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
login vn = new login();
vn.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regisActionPerformed
       login vn = new login();
vn.setVisible(true);
this.dispose();    
       agregarUser();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_regisActionPerformed

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
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_regis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_apeusu;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nomusu;
    // End of variables declaration//GEN-END:variables
}
