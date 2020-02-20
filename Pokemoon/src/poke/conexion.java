/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ANDRES
 */
public class conexion {
    
    private final String url = "jdbc:mysql://127.0.0.1/poke";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");         
         con = DriverManager.getConnection(url,"root","");
         if (con!=null){
            System.out.println("Conexión a base de datos. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("La conexion a la  base de datos a terminado");

    } 

    
}
