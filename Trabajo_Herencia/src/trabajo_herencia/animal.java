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
public class animal {
    private String especie, genero, nombre;
    private int edad;

    public animal() {
    }

    public animal(String especie, String genero, String nombre, int edad) {
        this.especie = especie;
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int suma(int numero, int numero2 ){
        
        return numero+numero2;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
