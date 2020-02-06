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
public class Cilindro extends Circulo{
    
    int altura;

    public Cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    
    
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void Cilindro(){
    
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del Cilindro", "Cilindro", 1));

        this.altura = dato;
    
    }    
    public void paint(Graphics g){
    
        g.setColor(Color.DARK_GRAY);
        g.drawLine(100, 100, 100, this.altura);
        g.drawLine(200, 100, 200, this.altura);
        g.drawOval(100, 75, 100, 50);
        g.drawOval(100, this.altura-25, 100, 50);
    
    }
    
}