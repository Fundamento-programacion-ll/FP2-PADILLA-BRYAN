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
public class Empleado {
    private String nomb [];
    private String apell[];
    private String fechaIng[];
    private String fechaNac[];
    private int salario[];

    public String[] getNombre() {
        return nomb;
    }

    public void setNombre(String[] nombre) {
        this.nomb = nombre;
    }

    public String[] getApellido() {
        return apell;
    }

    public void setApellido(String[] apellido) {
        this.apell = apellido;
    }

    public String[] getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String[] fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String[] getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String[] fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }
    public Empleado() {
    }
    
    public void ingresoDatos(int dimension) {
        nomb= new String[dimension];
        apell= new String[dimension];
        fechaNac= new String[dimension];
        fechaIng= new String[dimension];
        salario= new int[dimension];
        for (int i = 0; i < dimension; i++) {
                nomb[i]=JOptionPane.showInputDialog(null,"INGRESE EL NOMBRE"+(i+1)+":");
                apell[i]=JOptionPane.showInputDialog(null,"INGRESE EL APELLIDO"+(i+1)+":");
                fechaIng[i]=JOptionPane.showInputDialog(null,"INGRESE LA FECHA DE INGRESO DATOS SEPARADO POR GUIONES (DIA-MES-AÑO): "+(i+1)+":");
                fechaNac[i]=JOptionPane.showInputDialog(null,"INGRESE LA FECHA DE NACIMIENTO DATOS SEPRADO POR GUIONES (DIA-MES-AÑO): "+(i+1)+":");
                salario[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL SALARIO"+(i+1)+":"));
        }
     }
     public void impresionEmpleados(int dimension){
         for (int i = 0; i < dimension; i++) {
             System.err.println("-------------BIENVENIDO----------------");
             System.out.println("-----------EMPLEADO"+(i+1)+"-----------");
             System.out.println("NOMBRE: "+nomb[i]);
             System.out.println("APELLIDO: "+apell[i]);
             System.out.println("FECHA INGRESO: "+fechaIng[i]);
             System.out.println("FECHA NACIMIENTO: "+fechaNac[i]);
             System.out.println("SALARIO: "+salario[i]);
         }
     }
     
     public String masSalario(int dimension){
         int ms=0;
         for (int i = 0; i < dimension-1; i++) {
             if(salario[i+1]>salario[i]){
                 ms=i+1;
             }
         }
         return "EL EMPLEADO CON  MAYOR SALARIO ES: "+nomb[ms];
     }
     
     public String masAntiguo(int dimension){
         int ms=0;                 
         for (int i = 0; i < dimension-1; i++) {
             String fecha1[]=fechaIng[i].split("-");
             String fecha2[]=fechaIng[i++].split("-");
             
             if(Integer.parseInt(fecha2[2])<Integer.parseInt(fecha1[2])){
                 ms=i+1;
             }else if(Integer.parseInt(fecha2[2])==Integer.parseInt(fecha1[2])){
                 if (Integer.parseInt(fecha2[1])<Integer.parseInt(fecha1[1])){
                    ms=i+1;
                 }else if(Integer.parseInt(fecha2[1])==Integer.parseInt(fecha1[1])){
                     if (Integer.parseInt(fecha2[0])<Integer.parseInt(fecha1[0])) {
                         ms=i+1;
                     }
                 } 
             }
         }
         return "EL EMPLEADO MAS ANTIGUO ES: "+nomb[ms];
     }
     
}
