/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bryan
 */
public class persona {
    String nombre;
    String apellido;
    String direccion;
    boolean estadoCivil;
    String cedula;
    int edad;
    String telefono;
    char genero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public char getGenero() {
        return genero;
    }
     public persona(String nombre, String apellido, String direccion, boolean estadoCivil, String cedula, int edad, String telefono, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return "nombre: " + this.getNombre();
           
    }
}
