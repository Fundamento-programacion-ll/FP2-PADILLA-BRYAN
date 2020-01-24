/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author ITQ
 */
public class vector {
    private int vector[];

    public int[] getvector() {
        return vector;
    }

    public void setvector() {
        
        String datosVector; 
        
        datosVector = JOptionPane.showInputDialog(null, "INGRESE LOS DATOS SEPARADOS POR COMA");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, ","); //datos,separador
        
        for (int i = 0; i < this.vector.length&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[i] = Integer.parseInt(tokkens.nextToken());
            
        }
   
    }
        public static boolean esPrimo(int dimension){
    int vector = 2;
    boolean primo=true;
    while ((primo) && (vector!=dimension)){
    if (dimension % vector == 0)
      primo = false;
    vector++;
  }
  return primo;
}

    public vector(int[] vector) {
        
        super();
        
        this.vector = vector;
    }
    
    public vector(int dimension) {
        
        super();
        
        vector=new int [dimension];
        
        this.setvector();
        
    }
    
    public vector() {
    }
    
     @Override
    public String toString() {
        return "VECTOR: "+Arrays.toString(vector); //To change body of generated methods, choose Tools | Templates.
    }
    
}

