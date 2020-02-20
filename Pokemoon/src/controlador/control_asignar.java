/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author ANDRES
 */
public class control_asignar {
    private sql sen;
    private String id_carnet;

    public String getId_carnet() {
        return id_carnet;
    }

    public void setId_carnet(String id_carnet) {
        this.id_carnet = id_carnet;
    }
    
    public control_asignar()
    {
    
        sen = new sql();
}
    
    public String ingresa_nombre_entrenador()
     { 
       String result;
       result = sen.datos_string("nombre", "select nombre from entrenador where id_entre='"+this.id_carnet+"';");
       return result;
    }
    public String ingresa_apellido_entrenador()
     { 
       String result;
       result = sen.datos_string("apellido", "select apellido from entrenador where id_entre='"+this.id_carnet+"';");
       return result;
    }
    
    public Object[][] ingresa_codpoke(String nombre_materia)
     { 
       String[] columnas = {"id"};
       Object[][] result = sen.datosTabla(columnas,"pokemon", "select * from pokemon where nombrepokemon='"+nombre_materia+"';");
       return result;
    }
    
    public String ingresa_carnet_entrenador()
     { 
       String result;
       result = sen.datos_string("id_entre", "select id_entre from entrenador where id_entre='"+this.id_carnet+"';");
       return result;
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public boolean existe_entrenador( String cod)
     {
         
        this.id_carnet = cod;
        return sen.existe(cod, " from entrenador where id_entre='"+cod+"';");
      
    }
    
    public Boolean registrar_matxest(int cod_materia)
     {
        String[] datos = {id_carnet, Integer.toString(cod_materia)};
        return sen.insertar(datos, "insert into entrepoke(cod_carnet,cod_materia ) values(?,?);");
    }
    
    public Object[][] datos_matricula (String id_estudiante)
     {
        String[] columnas={"cod_carnet","nombrepokemon"};
        Object[][] resultado = sen.datosTabla(columnas, "entrepoke", "select * from entrepoke, pokemon where  id=cod_materia and cod_carnet='"+id_estudiante+"';");
        return resultado;
      }
}
     

