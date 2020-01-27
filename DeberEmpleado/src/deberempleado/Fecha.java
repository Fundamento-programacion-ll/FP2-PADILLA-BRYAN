/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberempleado;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author bryan
 */
public class Fecha {
     Calendar c1 = Calendar.getInstance();
    Calendar c2 = new GregorianCalendar();
    
    int dia ;
    int mes;
    int año;
    
    public int getDia() {
        dia =  c2.get(Calendar.DATE);
        return dia;
    }

    public void setDia(int dia) {
        
        this.dia = dia;
    }
    
    public int getMes() {
        mes = c2.get(Calendar.MONTH);
        mes = mes+1;
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        año = c2.get(Calendar.YEAR);
        return año;
    }

    public void setAnio(int anio) {
        this.año = año;
    }
    
    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = getDia();
        this.mes = getMes();
        this.año = getAnio();
    }  
}
