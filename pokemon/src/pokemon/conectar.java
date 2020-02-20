
package pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectar {
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConeccion = "jdbc:mysql://127.0.0.1/proyecto_pokemon";
    private String usuario = "root";
    private String contraseña = "";
    public Connection con;
    
    public conectar(){
        try{
            Class.forName(driver);
        con = DriverManager.getConnection(cadenaConeccion, usuario, contraseña);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no se ha podido establecer una conecion con la base de datos" +e.getMessage());
            
        }
        
    }
    
}
