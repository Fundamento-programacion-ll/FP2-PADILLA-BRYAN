/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import modelo.persona;
import vista.usuario;

/**
 *
 * @author ITQ
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        usuario inicio = new usuario();
        // TODO code application logic here
        persona kevin = new 
        persona("kevin", "jimenez", "17222222", 
                24, 
                "222222", "la 41", 'm', true);
        persona orlando = new persona("kevin", "jimenez", "0", 0, "0", "la 41", 'm', true);
        persona jimenez = new persona("kevin", "jimenez", "0", 0, "0", "la 41", 'm', true);
        //System.out.println(kevin);
        
        inicio.menu();
        
    }
    

    }
    

