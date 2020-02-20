/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES
 */
public class control_entrenador {
    
    sql sensql;
   
    public control_entrenador() {
        
        sensql = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_entrenador(String id_entre, String nombre, String apellido, String fechacaptura, String medallas, String campeon)
    {               
        
            String datos[] = {id_entre,nombre,apellido,fechacaptura,medallas,campeon};           
            return sensql.insertar(datos, "insert into entrenador(id_entre, nombre,apellido,fechacaptura,medallas,campeon) values(?,?,?,?,?,?)");
                                  
        
    }
    
    
    
}
