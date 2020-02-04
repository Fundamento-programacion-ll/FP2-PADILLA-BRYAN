/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimorfismo;

/**
 *
 * @author ITQ
 */
public class depositos extends transaccion{ 
    double montoDe;
public depositos() {
    }

    public depositos(double montoDe) {
        this.montoDe = montoDe;
    }

    public depositos(double montoDe, int cuenta) {
        super(cuenta);
        this.montoDe = montoDe;
    }



    public double getMontoDe() {
        return montoDe;
    }

    public void setMontoDe(double montoDe) {
        this.montoDe = montoDe;
    }

    @Override
    public String ejecutar() {
        return " Número de Cuenta es: "+getCuenta()+" su deposito es: "+montoDe;    
    }
}
