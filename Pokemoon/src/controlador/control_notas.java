/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES
 */
public class control_notas {
    
      private sql sen;
    
    public control_notas()
    {
      sen = new sql();  
    }
    
    
    
    public Object[][] consulta_pokemones(String id)
       {
        String[] columnas={"cod_carnet","cod_materia", "nombrepokemon"};
        Object[][] resultado = sen.datosTabla(columnas, "entrepoke", "select * from entrepoke, pokemon where cod_materia=id  and cod_carnet='"+id+"';");
        return resultado;
       }
    
    public boolean ingresar_notas(String cod_carnetnota, String cod_materianota, Double nota)
    {               
           
            String datos[] = {cod_carnetnota, cod_materianota, Double.toString(nota)};           
            return sen.insertar(datos, "insert into nota(cod_carnetnota, cod_materianota, nota) values(?,?,?)");
                                  
        
    }
    
}
