/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author ITQ
 */
public class user {
     ArrayList listaPersonas = 
            new ArrayList<String>();
    
    
    public String agregarPersona(
    String nombre
    ){
        listaPersonas.add(nombre);        
        return "Persona agregada correctamente," 
                + nombre;
    }
    
    public String listaPersonas(){        
        String lista = "";           
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i));
            lista += listaPersonas.get(i).toString() + "\n";
        }                
        return lista;
    }
    

}
