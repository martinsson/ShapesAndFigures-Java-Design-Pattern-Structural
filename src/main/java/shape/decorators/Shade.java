package shape.decorators;

import coordinates.Position;
import shapes.Shape;

/**
 * Created by johan on 25/04/16.
 */
public class Shade implements ShapeDecorator {
    private Shape otherShape;

    public Shade(Shape otherShape) {
        this.otherShape = otherShape;
    }

    public Shade() {

    }

    public void drawAt(Position position) {
        otherShape.drawAt(position);
        System.out.println(" with shade");
    }

    public void setShape(Shape nextShape) {
        otherShape = nextShape;
    }
}
