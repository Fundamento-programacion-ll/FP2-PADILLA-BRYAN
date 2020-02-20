/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES
 */
public class control_pokemon {
    
    sql sqlmat;
   
    public control_pokemon() {
        
        sqlmat = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_pokemon(String nombrepokemon, String poderespecial1, String poderespecial2, String fechacaptura, String nivel)
    {               
        
            String datos[] = {nombrepokemon, poderespecial1, poderespecial2, fechacaptura, nivel};           
            return sqlmat.insertar(datos, "insert into pokemon(nombrepokemon, poderespecial1, poderespecial2, fechacaptura, nivel) values(?,?,?,?,?)");
                                  
        
    }

   
}
