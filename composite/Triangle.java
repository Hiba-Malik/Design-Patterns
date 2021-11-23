/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Fa18-bse-019
 */
public class Triangle extends BaseShape {
    
    private final int TRIANGLE_SIZE = 3;
    

    public Triangle(int[] x, int[] y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return TRIANGLE_SIZE;
    }

    @Override
    public int getHeight() {
        return TRIANGLE_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawPolygon(trix, triy, 3);
    }
}
