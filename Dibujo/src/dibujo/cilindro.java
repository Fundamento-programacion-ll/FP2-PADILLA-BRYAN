/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author ITQ
 */
public class cilindro extends circulo {

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public cilindro() {
        super();
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del cilindro"));
    }

//    public double getArea() {
//
//        return 2 * super.getArea() + this.getCircunferencia() * this.altura;
//
//    }
//
//    public double getVolumen() {
//        return super.getArea() * this.altura;
//
//    }

    public void paint(Graphics g) {
//        super.paint(g);
//        
//        g.setColor(Color.GREEN);
//
//        g.fillOval(getX(), (int) (getY() + this.altura), (int) super.getRadio(), (int) super.getRadio());
//
//        g.setColor(Color.GREEN);
//        g.drawLine((int) (super.getX() + super.getRadio()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX() + super.getRadio()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
//        g.drawLine((int) (getX()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));

    }

    @Override
    public String toString() {
        return "\nCilindro" + " \nAltura= " + this.altura + super.toString();
    }

}