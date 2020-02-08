/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_graficos;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author ITQ
 */
public abstract class Figura extends Canvas{
    
    @Override
    public abstract void paint(Graphics g);
    
}
