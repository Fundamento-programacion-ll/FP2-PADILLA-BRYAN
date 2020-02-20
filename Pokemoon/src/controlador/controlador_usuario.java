/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES
 */
public class controlador_usuario {
    
    sql sensql;
   
    public controlador_usuario() {
        
        sensql = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_usuario(String nombre, String apellido, String email, String contraseña)
    {               
        
            String datos[] = {nombre,apellido,email,contraseña};           
            return sensql.insertar(datos, "insert into usuarios(nombre,apellido,email,contraseña) values(?,?,?,?)");
                                  
        
    }
    
    
    
}
