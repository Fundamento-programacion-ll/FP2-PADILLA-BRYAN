/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author SISTEMAS CORP
 */
public class controladorArticulo {
    PreparedStatement ps = null;
    conector conexion = new conector();
    
    
    public void ingresarArticlos(articulo nuevoArticulo){
        String sqlInsert = 
"insert into articulos (nombre,descripcion,precio) values(?,?,?)";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane
.showMessageDialog(null, "Error al ingresar datos");
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
