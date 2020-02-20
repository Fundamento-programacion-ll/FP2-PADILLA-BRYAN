/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poke;

import controlador.control_entrenador;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ANDRES
 */
public class Interfaz_entrenador extends javax.swing.JInternalFrame {

    
    public Interfaz_entrenador() {
         initComponents();
      
       ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/pika.gif"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
         
       
        initComponents();
        limpiar();
        bloquear_cajas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_nuevoreg = new javax.swing.JButton();
        jButton_registrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_ape = new javax.swing.JTextField();
        txt_fech = new javax.swing.JTextField();
        vf = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_med = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButton_nuevoreg.setBackground(new java.awt.Color(0, 0, 255));
        jButton_nuevoreg.setFont(new java.awt.Font("Bungee Inline", 0, 11)); // NOI18N
        jButton_nuevoreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Pokemon_Go-16_icon-icons.com_67643 (1).png"))); // NOI18N
        jButton_nuevoreg.setText("Nuevo registro");
        jButton_nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoregActionPerformed(evt);
            }
        });

        jButton_registrar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_registrar.setFont(new java.awt.Font("Bungee Inline", 0, 11)); // NOI18N
        jButton_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Pokemon_Go-17_icon-icons.com_67645.png"))); // NOI18N
        jButton_registrar.setText("Registrar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Bungee Inline", 0, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Pokemon_Go-11_icon-icons.com_67644.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        txt_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeActionPerformed(evt);
            }
        });

        txt_fech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechActionPerformed(evt);
            }
        });

        vf.setForeground(new java.awt.Color(153, 0, 153));
        vf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Verdaero", "Falso" }));
        vf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Fecha Nacimiento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Campeon Actual:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("# Medallas:");

        txt_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Bungee Inline", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/Pokemon_Go-15_icon-icons.com_67646.png"))); // NOI18N
        jButton1.setText("Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bungee Inline", 0, 24)); // NOI18N
        jLabel7.setText("Entrenador Pokemon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_med, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txt_ape)
                                    .addComponent(txt_fech))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_nuevoreg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jButton1))
                                        .addGap(18, 18, 18))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton_registrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(vf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_nuevoreg)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_registrar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar()
    {
       txt_id.setText("");
       txt_nom.setText("");
       txt_ape.setText("");
       txt_fech.setText("");
       
        
    }
    
    public void  bloquear_cajas()
    {
       txt_id.setEnabled(false);
       txt_nom.setEnabled(false);
       txt_ape.setEnabled(false);
       txt_fech.setEnabled(false);            
       vf.setEnabled(false); 
       jButton_nuevoreg.setEnabled(true);
       jButton_registrar.setEnabled(false);
       txt_med.setEnabled(false);
      
       
    }
    public void  desbloquear()
    {
       txt_id.setEnabled(true);
       txt_nom.setEnabled(true);
       txt_ape.setEnabled(true);
       txt_fech.setEnabled(true);
       vf.setEnabled(true);       
       txt_med.setEnabled(true);        
       jButton_registrar.setEnabled(true);
       jButton_nuevoreg.setEnabled(false);
       
       
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
    String id,nom,ape,fech,med,camp; 
      
        
        id = txt_id.getText();
        nom = txt_nom.getText();    
        ape = txt_ape.getText();   
        fech= txt_fech.getText();  
        med= txt_med.getText(); 
        camp = vf.getSelectedItem().toString();     
        
        control_entrenador est = new control_entrenador();
        if(!id.equals("") && !nom.equals("") && !ape.equals("") && !fech.equals("")  && !med.equals("")&& !id.equals(""))
        {
        if(est.ingresar_entrenador(id,nom,ape,fech,med,camp))
        {
        JOptionPane.showMessageDialog(null,"SU REGISTRO FUE EXITOSOs ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Digita los campos obligatorios");  
        }
        
       
          
                    
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoregActionPerformed
    desbloquear();
    txt_id.requestFocus();
    }//GEN-LAST:event_jButton_nuevoregActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
    txt_id.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
    txt_nom.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeActionPerformed
    txt_ape.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeActionPerformed

    private void txt_fechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechActionPerformed
    txt_fech.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechActionPerformed

    private void vfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vfActionPerformed
    vf.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_vfActionPerformed

    private void txt_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        consulta_entre_poke CON = new consulta_entre_poke();
        CON.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_nuevoreg;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_fech;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_med;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JComboBox vf;
    // End of variables declaration//GEN-END:variables
}
