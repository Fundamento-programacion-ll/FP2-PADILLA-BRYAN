/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimorfismo;

/**
 *
 * @author ITQ
 */
public class Deberpolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        retiros re= new retiros(1121, 6784);
        System.out.println(re.ejecutar());
        depositos de= new depositos (74510, 78411);
        System.out.println(de.ejecutar());
        solicitudSaldo ss=new solicitudSaldo(123845, 741341);
        System.out.println(ss.ejecutar());
    }
    }
    

