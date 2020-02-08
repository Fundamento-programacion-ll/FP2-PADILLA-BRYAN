/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_graficos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author ITQ
 */
public class Rectangulo extends Figura{
    
    int ladoMayor;
    int ladoMenor;

    public Rectangulo(int ladoMayor, int ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public int getLadoMayor() {
        return ladoMayor;
    }

    public int getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMayor(int ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public void setLadoMenor(int ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
    public void Rectangulo(){
    
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Lado Mayor del Rectangulo", "Rectángulo", 1));

        this.ladoMayor = dato;
        
        int dato2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Lado Menor del Rectangulo", "Rectángulo", 1));
        
        this.ladoMenor = dato2;
    
    }

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.pink);
        g.drawRect(10, 10, this.ladoMayor, this.ladoMenor);
        
    }
    
}

