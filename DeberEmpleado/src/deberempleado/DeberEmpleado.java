/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberempleado;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class DeberEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha f= new Fecha();
        Empleado e= new Empleado();
        int dimension=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL NUMEROS DE EMPLEADOS:"));
        e.ingresoDatos(dimension);
        System.out.println("DIA: "+f.getDia()+" MES: "+f.getMes()+" AÑO: "+f.getAnio());
        e.impresionEmpleados(dimension);
        System.out.println(e.masSalario(dimension));
        System.out.println(e.masAntiguo(dimension));
    }
    
}
