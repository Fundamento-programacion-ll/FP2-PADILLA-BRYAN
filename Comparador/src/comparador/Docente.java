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
public class Docente extends Persona{
    private String area2;
    private String cargo;

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Docente(String area2, String cargo, int edad, String nombre, String apellido, String genero, int ci, double sueldoa, double sueldod, double sueldol) {
        super(edad, nombre, apellido, genero, ci, sueldoa, sueldod, sueldol);
        this.area2 = area2;
        this.cargo = cargo;
    }

    public Docente(String area2, String cargo) {
        this.area2 = area2;
        this.cargo = cargo;
    }

    

    public Docente() {
    }

    
    

    @Override
    public String toString() {
        return "----Docente---- \n"+"nombre y apellido: "+getNombre()+" "+getApellido()+"\n"
                +"edad: "+getEdad()+"\n"
                +"CI. : "+getCi()+"\n"
                +"Genero : "+getGenero()+"\n"
                +"Area : "+getArea2()+"\n"
                +"Cargo. : "+getCargo()+"\n";
    }

    

}