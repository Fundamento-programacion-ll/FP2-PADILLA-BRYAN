/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_figuras;

import java.util.Scanner;

/**
 *
 * @author ITQ
 */
public class Herencia_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
while (!salir){
        System.out.println("Seleccionar figura");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Salir ");
        Scanner sc= new Scanner(System.in);
        cuadrado c= new cuadrado();
        triangulo t= new triangulo();
        circulo cir= new circulo();
        int op=sc.nextInt();
      
        
        switch (op){
            case 1:
                System.out.println("Ingrese el lado del cuadrado:");
                c.base=sc.nextInt();
                c.datosCuadrado();
                break;
            case 2:
                System.out.println("Ingrese la base del triangulo:");
                t.base=sc.nextInt();
                System.out.println("Ingrese la altura del triangulo:");
                t.altura=sc.nextInt();
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo:");
                cir.lado=sc.nextInt();
                cir.datosCirculo();
                break;
           case 4:
                salir = true;
                break;
            default:
                System.out.println("Ingrese un opcion correcta");
                break;
        }
              
    
   
    }
    }
}

