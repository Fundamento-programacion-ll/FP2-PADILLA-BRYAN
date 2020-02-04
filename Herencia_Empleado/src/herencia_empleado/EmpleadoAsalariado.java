/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_empleado;

/**
 *
 * @author ITQ
 */
public class EmpleadoAsalariado extends Empleado{
    double salarioSemanal;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal<0.0?0.0:salarioSemanal;
    }

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.salarioSemanal = salarioSemanal;
    }

  

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString() {
        return "Empleado asalariado "+"NOMBRE "+getNombre()+" APELLIDO "+getApellido()+" CI "+getCi()+" Salario Semanal "+getSalarioSemanal();
    }

    @Override
    public Double calcularIngresos() {
        return this.salarioSemanal;
    } {
    
}
}
