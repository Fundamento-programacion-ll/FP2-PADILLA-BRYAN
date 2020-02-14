/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

/**
 *
 * @author bryan
 */
public class Persona {
private int edad;
    private String nombre,apellido,genero;
    private int ci;
    private double sueldoa;
    private double sueldod;
    private double sueldol;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public double getSueldoa() {
        return sueldoa;
    }

    public void setSueldoa(double sueldoa) {
        this.sueldoa = sueldoa;
    }

    public double getSueldod() {
        return sueldod;
    }

    public void setSueldod(double sueldod) {
        this.sueldod = sueldod;
    }

    public double getSueldol() {
        return sueldol;
    }

    public void setSueldol(double sueldol) {
        this.sueldol = sueldol;
    }

    public Persona(int edad, String nombre, String apellido, String genero, int ci, double sueldoa, double sueldod, double sueldol) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.ci = ci;
        this.sueldoa = sueldoa;
        this.sueldod = sueldod;
        this.sueldol = sueldol;
    }


    public Persona() {
        

    }

    @Override
    public String toString() {
        return "Sueldo del administrador: "+this.sueldoa+"Sueldo del Docente: "+this.sueldod+" Sueldo de Limpieza"+this.sueldol;
    }
 
    
}
