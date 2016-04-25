package shape.decorators;

import coordinates.Position;
import shapes.Shape;

/**
 * Created by johan on 25/04/16.
 */
public class Border implements Shape, ShapeDecorator {
    private Shape shape;

    public Border(Shape shape) {
        this.shape = shape;
    }

    public Border() {

    }

    public void drawAt(Position position) {
        shape.drawAt(position);
        System.out.println(" with border");
    }

    public void setShape(Shape nextShape) {
        this.shape = nextShape;
    }
}
