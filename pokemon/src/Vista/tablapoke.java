/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import pokemon.conectar;
/**
 *
 * @author User
 */
public class tablapoke extends javax.swing.JFrame {
conectar cc=new conectar();
Connection con=cc.con;
    public tablapoke() {
        initComponents();
      
        
         setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pokemon");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
       ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/donfo.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        mostrarDatos();
        
         noVisibles();
         
    }

     public void noVisibles(){
        this.txt_num.setVisible(false);
        this.txt_nom.setVisible(false);
        this.txt_p1.setVisible(false);
        this.txt_p2.setVisible(false);
        this.txt_cap.setVisible(false);
        this.txt_nivel.setVisible(false);
        this.txt_ide.setVisible(false);
        this.bt_guardar.setVisible(false);
        this.icon.setVisible(true);
        
        this.lb1.setVisible(false);
        this.lb2.setVisible(false);
        this.lb3.setVisible(false);
        this.lb4.setVisible(false);
        this.lb5.setVisible(false);
        this.lb6.setVisible(false);
        this.lb7.setVisible(false);
     
    }
    public void visibles(){
        this.txt_num.setVisible(true);
        this.txt_nom.setVisible(true);
        this.txt_p1.setVisible(true);
        this.txt_p2.setVisible(true);
        this.txt_cap.setVisible(true);
        this.txt_nivel.setVisible(true);
        this.txt_ide.setVisible(true);
        this.bt_guardar.setVisible(true);
        this.icon.setVisible(false);
        
        this.lb1.setVisible(true);
        this.lb2.setVisible(true);
        this.lb3.setVisible(true);
        this.lb4.setVisible(true);
        this.lb5.setVisible(true);
        this.lb6.setVisible(true);
        this.lb7.setVisible(true);
        
    }
       public void limpiar(){
        txt_num.setText("");
        txt_nom.setText("");
        txt_p1.setText("");
        txt_p2.setText("");
        txt_cap.setText("");
        txt_nivel.setText("");
        txt_ide.setText("");
       
        
    }
     public void actualizarDatos(){
         conectar cc = new conectar();
        Connection cn = cc.con;
        String id, num, nom, p1, p2, cap, nivel, ide;
        String sql ="";
        
        num = txt_num.getText();
        nom = txt_nom.getText();
        p1 = txt_p1.getText();
        p2 = txt_p2.getText();
        cap = txt_cap.getText();
        nivel = txt_nivel.getText();
        ide = txt_ide.getText();
        sql ="update pokemon set numeropokemon=?, nombrepokemon=?, poderespecialuno=?, poderespecialdos=?, fechacaptura=?, nivel=?, entrenadorid=? where id=?";
      
        int filaSelec=tabla.getSelectedRow();       
        String dao=(String)tabla.getValueAt(filaSelec, 0);
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
          
            pst.setString(1, num);
            pst.setString(2, nom);
            pst.setString(3, p1);
            pst.setString(4, p2);
            pst.setString(5, cap);
            pst.setString(6, nivel);
            pst.setString(7, ide);
            pst.setString(8, dao);
            
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Resgistro editado con exito");
                noVisibles();
            }
        } catch (SQLException ex) {
            Logger.getLogger(entrenador.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
  
    public void agregarDatos(){
         conectar cc = new conectar();
        Connection cn = cc.con;
        String id, num, nom, p1, p2, cap, nivel, ide;
        String sql ="";
        
        num = txt_num.getText();
        nom = txt_nom.getText();
        p1 = txt_p1.getText();
        p2 = txt_p2.getText();
        cap = txt_cap.getText();
        nivel = txt_nivel.getText();
        ide = txt_ide.getText();
        
        sql ="INSERT INTO pokemon (numeropokemon, nombrepokemon, poderespecialuno, poderespecialdos, fechacaptura, nivel, entrenadorid) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, num);
            pst.setString(2, nom);
            pst.setString(3, p1);
            pst.setString(4, p2);
            pst.setString(5, cap);
            pst.setString(6, nivel);
            pst.setString(7, ide);
           
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Resgistro guardado con exito");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(entrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
    
    public void mostrarDatos(){
               

        String[] titulos={"ID", "Numero Pokemon", "Nombre Pokemon", "Poder especial Uno", "Poder especial Dos", "Fecha de Captura", "nivel", "ID Entrenador"};
        String[] registros=new String[9];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String sql="select * from pokemon";
        
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            
          while(rs.next()){
              
              registros[0]=rs.getString("id");
              registros[1]=rs.getString("numeropokemon");
              registros[2]=rs.getString("nombrepokemon");
              registros[3]=rs.getString("poderespecialuno");
              registros[4]=rs.getString("poderespecialdos");
              registros[5]=rs.getString("fechacaptura");
              registros[5]=rs.getString("nivel");
              registros[7]=rs.getString("entrenadorid");
              
              modelo.addRow(registros);
              
          }
          tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror al mostrar datos" +e.getMessage());
        }
    }
     public void filtrarDatos(String valor){
               

        String[] titulos={"ID", "Numero Pokemon", "Nombre Pokemon", "Poder especial Uno", "Poder especial Dos", "Fecha de Captura", "nivel", "ID Entrenador"};
        String[] registros=new String[9];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String sql="select * from pokemon where nombrepokemon like '%"+valor+"%'";
        
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
          while(rs.next()){
              
              registros[0]=rs.getString("id");
              registros[1]=rs.getString("numeropokemon");
              registros[2]=rs.getString("nombrepokemon");
              registros[3]=rs.getString("poderespecialuno");
              registros[4]=rs.getString("poderespecialdos");
              registros[5]=rs.getString("fechacaptura");
              registros[6]=rs.getString("nivel");
              registros[7]=rs.getString("entrenadorid");
              
              modelo.addRow(registros);
              
          }
          tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror al mostrar datos" +e.getMessage());
        }
    }
     
     public void eliminar(){
     int filaSelec=tabla.getSelectedRow();  
     try {
        String sql="delete from pokemon where id="+tabla.getValueAt(filaSelec,0);
        
        Statement st=con.createStatement();
        
        int n=st.executeUpdate(sql);
        
        if(n>=0){
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            
        }
        
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al eliminadar registro"+e.getMessage());
            
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

        icon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bt_eliminar = new javax.swing.JButton();
        bt_actualizar = new javax.swing.JButton();
        bt_nuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_busquar = new javax.swing.JTextField();
        txt_num = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_p1 = new javax.swing.JTextField();
        txt_p2 = new javax.swing.JTextField();
        txt_cap = new javax.swing.JTextField();
        txt_nivel = new javax.swing.JTextField();
        txt_ide = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        bt_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pik.gif")); // NOI18N

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(153, 51, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        bt_actualizar.setText("Actualizar");
        bt_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizarActionPerformed(evt);
            }
        });

        bt_nuevo.setText("Nuevo");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSQUEDA:");

        txt_busquar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquarActionPerformed(evt);
            }
        });
        txt_busquar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquarKeyReleased(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Numero Pokemon");

        lb2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Nombre Pokemon");

        lb3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Poder Especial 1");

        lb4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Poder Especial 2");

        lb5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Fecha de Captura");

        lb6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("Nivel");

        lb7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setText("ID Entrenador");

        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(bt_eliminar)
                .addGap(58, 58, 58)
                .addComponent(bt_actualizar)
                .addGap(85, 85, 85)
                .addComponent(bt_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_guardar)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(txt_busquar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb7)
                            .addComponent(lb3)
                            .addComponent(lb2)
                            .addComponent(lb4)
                            .addComponent(lb1)
                            .addComponent(lb5)
                            .addComponent(lb6))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_num)
                            .addComponent(txt_nom)
                            .addComponent(txt_p1)
                            .addComponent(txt_p2)
                            .addComponent(txt_cap)
                            .addComponent(txt_nivel)
                            .addComponent(txt_ide, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(icon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_busquar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_nuevo)
                    .addComponent(bt_eliminar)
                    .addComponent(jButton1)
                    .addComponent(bt_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3))
                .addGap(2, 2, 2)
                .addComponent(bt_guardar)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       Sistema op=new Sistema();
        op.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int filaSelec=tabla.rowAtPoint(evt.getPoint());

        txt_num.setText(tabla.getValueAt(filaSelec,1).toString());
        txt_nom.setText(tabla.getValueAt(filaSelec,2).toString());
        txt_p1.setText(tabla.getValueAt(filaSelec,3).toString());
        txt_p2.setText(tabla.getValueAt(filaSelec,4).toString());
        txt_cap.setText(tabla.getValueAt(filaSelec,5).toString());
        txt_nivel.setText(tabla.getValueAt(filaSelec,4).toString());
        txt_ide.setText(tabla.getValueAt(filaSelec,5).toString());

    }//GEN-LAST:event_tablaMouseClicked

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed

        eliminar();
        mostrarDatos();
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizarActionPerformed
visibles();
        actualizarDatos();
        limpiar();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_actualizarActionPerformed

    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed

        visibles();
        limpiar();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void txt_busquarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquarActionPerformed

    private void txt_busquarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquarKeyReleased

        filtrarDatos(txt_busquar.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquarKeyReleased

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
agregarDatos();
mostrarDatos();// TODO add your handling code here:
    }//GEN-LAST:event_bt_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(tablapoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablapoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablapoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablapoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablapoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_actualizar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_busquar;
    private javax.swing.JTextField txt_cap;
    private javax.swing.JTextField txt_ide;
    private javax.swing.JTextField txt_nivel;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_p1;
    private javax.swing.JTextField txt_p2;
    // End of variables declaration//GEN-END:variables
}
