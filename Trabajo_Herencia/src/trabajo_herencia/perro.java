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
public class perro extends animal{
    private float estatura;

    public perro(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }
    
    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public void datosPerro(){
        System.out.println(getNombre()+" "+getEdad()+" "+getEstatura());
        System.out.println(suma(5, 6));
    }

    
}
