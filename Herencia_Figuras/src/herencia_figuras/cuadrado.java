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
public class cuadrado extends figura {

    int base;
    public void datosCuadrado(){
        int perimetro=base*4;
        int area=base*base;
        int volumen= base*base*base;
        
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    }
    
}
