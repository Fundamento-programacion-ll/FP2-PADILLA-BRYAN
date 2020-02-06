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
public class Cuadrado extends Figura{
    
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

   

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void Cuadrado() {
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Lado del Cuadrado", "Cuadrado", 1));

        this.lado = dato;
        
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.black);
        g.drawRect(100, 100, this.lado, this.lado);
        
    }
    
}