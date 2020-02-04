/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_figuras;

/**
 *
 * @author ITQ
 */
public class circulo extends figura {

    int lado;
        public void datosCirculo(){
        double perimetro=lado*2*Math.PI;
        double area=Math.pow(lado, 2)*Math.PI;
        double volumen= (4/3)*Math.PI*Math.pow(lado, 3);
        
        System.out.println("El area es: "+area);
        System.out.println("La Circunferencia es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    }
}