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
public class Deposito extends Transaccion{
    private double montoD;

    

    public double getMontoD() {
        return montoD;
    }

    public void setMontoD(double montoD) {
        this.montoD = montoD;
    }

    public Deposito(double montoD, int cuenta) {
        super(cuenta);
        this.montoD = montoD;
    }

    public Deposito(double montoD) {
        this.montoD = montoD;
    }

    public Deposito() {
    }

    
    
    
    
    @Override
    public String ejecutar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       return "Cuenta: "+getCuenta()+"\n A depositado: "+montoD;
    }

    @Override
    public String toString() {
        return "N_ cuenta es: "+getCuenta()+" su Deposito es de: "+getMontoD();
    }
    
}
