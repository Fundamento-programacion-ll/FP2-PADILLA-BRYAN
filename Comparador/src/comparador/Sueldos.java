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
public class Sueldos implements Comparable <Sueldos>{

    private String nombre;
	private int sueldo;
	
	Sueldos (String nombre, int sueldo){
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString(){
		return this.getNombre()+" Su sueldo es: "+getSueldo();
	}

	public String getNombre(){
		return this.nombre;
	}
	public int getSueldo(){
		return this.sueldo;
	}	
	
	@Override
	public int compareTo(Sueldos p){
		return this.getNombre().compareTo(p.getNombre());
	}
   

    
    
}