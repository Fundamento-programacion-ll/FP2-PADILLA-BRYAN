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
public class triangulo extends figura{
        public void datosTriangulo(){
        int perimetro=base*3;
        int area=(base*altura)/2;
        int volumen=(area*altura)/3 ;
        
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    } 
    
}
