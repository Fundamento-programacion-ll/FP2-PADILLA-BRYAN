/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author ITQ
 */
public class Empleado {
String nombre;
	String direccion;
	int cedula; 
	double salario;
	
	public String getNombre() {
		return nombre;
	}
	public Empleado(String nombre, int cedula, String direccion, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.salario = salario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
  
    
}
