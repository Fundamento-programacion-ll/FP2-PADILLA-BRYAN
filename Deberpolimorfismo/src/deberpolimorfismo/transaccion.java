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
public abstract class transaccion {
    int cuenta;

    public transaccion() {
    }

    public transaccion(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public abstract String ejecutar();
    
    public String obtenercuenta(){
    return ejecutar();
    }
}