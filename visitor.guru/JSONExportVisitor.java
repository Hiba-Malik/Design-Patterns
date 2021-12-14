/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.guru;

/**
 *
 * @author fa18-bse-019
 */
public class JSONExportVisitor implements Visitor {

    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("{" + "\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        sb.append("/n}");
        return sb.toString();
    }

    public String visitDot(Dot d) {
        return "{" + "\n" +
                "    id:" + d.getId() + "," + "\n" +
                "    x:" + d.getX() + "," + "\n" +
                "    y:" + d.getY() + "," + "\n" +
                "}";
    }

    public String visitCircle(Circle c) {
        return "{" + "\n" +
                "    id:" + c.getId() + "," + "\n" +
                "    x:" + c.getX() + "," + "\n" +
                "    y:" + c.getY() + "," + "\n" +
                "    radius:" + c.getRadius() + "," + "\n" +
                "}";
    }

    public String visitRectangle(Rectangle r) {
        return "{" + "\n" +
                "    id:" + r.getId() + "," + "\n" +
                "    x:" + r.getX() + "," + "\n" +
                "    y:" + r.getY() + "," + "\n" +
                "    width:" + r.getWidth() + "," + "\n" +
                "    height:" + r.getHeight() + "," + "\n" +
                "}";
    }

    public String visitCompoundGraphic(CompoundShape cg) {
        return "{" + "\n" +
                "   id:" + cg.getId() + "," + "\n" +
                _visitCompoundGraphic(cg) +
                "}";
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.children) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
    
}
