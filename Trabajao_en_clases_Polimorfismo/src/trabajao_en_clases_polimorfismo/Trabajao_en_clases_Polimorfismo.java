/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajao_en_clases_polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Trabajao_en_clases_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta;
        String mensaje;
        double retir, deposito; 
        double  saldo,total;
        
        SolicitudSaldo sa = new SolicitudSaldo();    
        Deposito de = new Deposito();
        Retiros re = new Retiros();
        
        
        cuenta=Integer.parseInt(JOptionPane.showInputDialog("Menu"+"\n "
                + "Ingrese su numero de cuenta"));
    
        do{
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo que va hacer "));   
        
        if(saldo <= 0){
            JOptionPane.showMessageDialog(null, "cantidad es incorrecto"+
            "\n Intente nuevamente");
        }
        }while (saldo <=0);
                
        do {
        retir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el retiro que va hacer"));
        if (retir >100){
            JOptionPane.showMessageDialog(null, "Tines un  retiro maximo hasta 100");
        }else if (retir <=0 ){
             JOptionPane.showMessageDialog(null, "cantidad es incorrecto"+
                     "\n Intente nuevamente");
        }         
        }while(retir <= 0 || retir>=100);
        
        do{
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Deposito que va hacer"));  
        
        if(deposito <= 0){
            JOptionPane.showMessageDialog(null, "cantidad es incorrecto"+
                    "\n Intente nuevamente");
        }
        }while (deposito <=0);
        
        total=saldo+deposito-retir;
        
        SolicitudSaldo a=new SolicitudSaldo(saldo, cuenta);
        System.out.println(a);
        
        Retiros b=new Retiros(retir, cuenta);
        System.out.println(b);
        
        Deposito c=new  Deposito(deposito, cuenta);
        System.out.println(c);
        
        
        System.out.println("Su total es: "+total);
    }
    
}
    
    

