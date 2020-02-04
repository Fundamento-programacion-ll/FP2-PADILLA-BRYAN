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
public class Retiros extends Transaccion{
    private double monto;

    

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Retiros(double monto, int cuenta) {
        super(cuenta);
        this.monto = monto;
    }

    public Retiros(double monto) {
        this.monto = monto;
    }

    public Retiros() {
    }
    
    
    @Override
    public String ejecutar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return "Cuenta: "+getCuenta()+"\n su saldo es : "+monto;
    }

    @Override
    public String toString() {
        return "N_ cuenta: "+getCuenta()+" El Retiro es de: "+getMonto();
    }
    
    
}
