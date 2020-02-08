/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

import java.util.Comparator;

/**
 *
 * @author bryan
 */
public class menor_mayor implements Comparator <Sueldos>{

    @Override
    public int compare(Sueldos s1, Sueldos s2) {
        if (s1.getSueldo() > s2.getSueldo() ) return 1;
        if (s1.getSueldo() < s2.getSueldo() ) return -1;
	return 0;
    }
    
}