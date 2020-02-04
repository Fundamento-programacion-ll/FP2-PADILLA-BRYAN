/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajao_en_clases_polimorfismo;

/**
 *
 * @author bryan
 */
public class SolicitudSaldo extends Transaccion {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public SolicitudSaldo(double valor, int cuenta) {
        super(cuenta);
        this.valor = valor;
    }

    public SolicitudSaldo(double valor) {
        this.valor = valor;
    }

    public SolicitudSaldo() {
    }

    
    
    
    
    @Override
    public String ejecutar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return "Cuenta: "+getCuenta()+" Su saldo es de: "+valor;
    }

    @Override
    public String toString() {
        return ejecutar();
    }
    
    
}
