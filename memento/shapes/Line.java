
package memento.shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Line extends BaseShape {
    private final int LINE_SIZE = 60;

    public Line(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return LINE_SIZE;
    }

    @Override
    public int getHeight() {
        return 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}
