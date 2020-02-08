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
public class Administratvo  extends Persona{
    private String area;

    public Administratvo(String area, int edad, String nombre, String apellido, String genero, int ci, double sueldoa, double sueldod, double sueldol) {
        super(edad, nombre, apellido, genero, ci, sueldoa, sueldod, sueldol);
        this.area = area;
    }

    public Administratvo(String area) {
        this.area = area;
    }

    public Administratvo() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    
    @Override
    public String toString() {
        return "----Administrativo---- \n"+"nombre y apellido: "+getNombre()+" "+getApellido()+"\n"
                +"edad: "+getEdad()+"\n"
                +"CI. : "+getCi()+"\n"
                +"Genero : "+getGenero()+"\n"
                +"Area : "+getArea()+"\n";
    }
    
    
    
}
