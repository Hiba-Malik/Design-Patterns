package composite;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED),
                    new Triangle(new int[]{10, 30, 50},new int[]{100, 50, 100},Color.PINK)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),
                
                new CompoundShape(
                new Circle(250, 10, 50, Color.RED),
                new Triangle(new int[]{350, 290, 240},new int[]{90, 40, 90},Color.PINK))
        );
    }
}
