/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author ITQ
 */
public class Empresa {
    private Empleado E1;
	/**
	 * 
	 * @ seter y geter mas contructor
	 */
	public Empleado getE1() {
		return E1;
	}
	public void setE1(Empleado e1) {
		E1 = e1;
	}
	public Empresa(Empleado e1) {
		super();
		E1 = e1;
	}
	//main
	public static void main(String[] args) {
		new Empresa();
	}
	/**
	 * contructori principal
	 */
	public Empresa() {
		super();
		validarUser();
	}
	/**
	 * verificar si el boton da aceptar
	 */
	public void validarUser() {
			String confirmar = JOptionPane.showInputDialog("desear Crear Empleado");
	 		if (confirmar != null ) {
			String nombre = ingresarInfo("ingrese nombre");
			String direccion = ingresarInfo("ingrese direccion");
			int cedula = Integer.parseInt(ingresarInfo("Ingresar Cedula"));
			double salario = Double.parseDouble(ingresarInfo("ingrese salario"));
			E1 = new Empleado(nombre, cedula, direccion, salario);	
			String aumento = JOptionPane.showInputDialog("desea aumentar en un 10% sueldo?");
			if (aumento != null ) {
				imprimir(E1.direccion+" : "+"sueldo: " + aumentarSalario() );
			}
			else {
				double decreneto = Integer.parseInt(JOptionPane.showInputDialog("cuando % va a decrementar sueldo?"));
				imprimir(E1.direccion +" : "+ descontarSalario(decreneto));
			}
		}else {
			System.out.println("no hizo nada");
		}
	}
	public double descontarSalario(Double decreneto) {
		double salario= E1.salario - ((decreneto/100)*E1.salario);
		return  salario;
	}
	public double aumentarSalario() {
		 double salario = E1.salario+(E1.salario*0.1);
		 return salario;
	}
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	public String ingresarInfo(String mensaje) {
		String valor = JOptionPane.showInputDialog(mensaje);
		return valor;
	}
}
