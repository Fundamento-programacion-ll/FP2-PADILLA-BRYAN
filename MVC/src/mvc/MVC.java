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
 * @author bryan
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        usuario inicio = new usuario();
        persona Bryan=new persona("Bryan", "Padilla", "SanJuan", true, "1725141035", 20, "0991245455", 'm');
        persona Juan=new persona("Juan", "Padilla", "Carcelen", true, "1752509206", 23, "099124744", 'm');
        persona Ana=new persona("Ana", "Padilla", "Toctuico", true, "1752121231", 19, "0996112412", 'f');
        
//        System.out.println(gabriel);
        inicio.menu();
    }
    }
    

