/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_herencia;

/**
 *
 * @author ITQ
 */
public class gato extends animal {
    String colorOjos;

    public gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public gato(String colorOjos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.colorOjos = colorOjos;
    }
    
    
    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public void datosGato(){
        System.out.println(getNombre()+" "+getColorOjos()+" "+getGenero());
    }
    
}
