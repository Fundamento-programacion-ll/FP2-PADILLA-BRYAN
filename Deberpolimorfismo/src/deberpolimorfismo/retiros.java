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
public class retiros extends transaccion {
    double montoRe;

    public retiros() {
    }

    public retiros(double montoRe) {
        this.montoRe = montoRe;
    }

    public retiros(double montoRe, int cuenta) {
        super(cuenta);
        this.montoRe = montoRe;
    }

    public double getMontoRe() {
        return montoRe;
    }

    public void setMontoRe(double montoRe) {
        this.montoRe = montoRe;
    }

    @Override
    public String ejecutar() {
        return " Número de Cuenta : "+getCuenta()+" su retiro es: "+montoRe;
    }
}
    

