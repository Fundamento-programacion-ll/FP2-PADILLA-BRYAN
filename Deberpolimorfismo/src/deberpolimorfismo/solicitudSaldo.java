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
public class solicitudSaldo extends transaccion{
    double valor;

    public solicitudSaldo() {
    }

    public solicitudSaldo(double valor) {
        this.valor = valor;
    }

    public solicitudSaldo(double valor, int cuenta) {
        super(cuenta);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String ejecutar() {
        return " Su número de Cuenta es: "+getCuenta()+" su saldo es: "+valor;    
    }{
    
}
}
    
