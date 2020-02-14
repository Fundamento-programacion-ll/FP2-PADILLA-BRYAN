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
public class Limpieza extends Persona{
   private String Turno;

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public Limpieza(String Turno, int edad, String nombre, String apellido, String genero, int ci, double sueldoa, double sueldod, double sueldol) {
        super(edad, nombre, apellido, genero, ci, sueldoa, sueldod, sueldol);
        this.Turno = Turno;
    }

    public Limpieza(String Turno) {
        this.Turno = Turno;
    }

    public Limpieza() {
    }

    

    @Override
    public String toString() {
        return "----Limpieza---- \n"+"nombre y apellido: "+getNombre()+" "+getApellido()+"\n"
                +"edad: "+getEdad()+"\n"
                +"CI. : "+getCi()+"\n"
                +"Genero : "+getGenero()+"\n"
                +"Area : "+getTurno()+"\n";
    } 

}