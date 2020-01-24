/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import javax.swing.JOptionPane;

/**
 *
 * @author ITQ
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA DIMENCIO DEL ARREGLO"));
        
        vector v=new vector(dimension);
        
        System.out.println(v);
        
    }

 
    }
    

