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
public class Circulo extends Punto{
    
    int radio;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

  

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int x, int y) {
        super(x, y);
    }

    public void Circulo(){
    
    int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Radio", "Círculo", 1));

    this.radio = dato;
    
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + this.radio + '}';
    }
    
    public void paint(Graphics g) {
    
        g.setColor(Color.GREEN);
        g.drawOval(getX(), getY(), this.radio, this.radio);
    
    }
    
}