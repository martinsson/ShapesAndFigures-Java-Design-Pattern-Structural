import shapes.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Border implements Shape{
    private Shape shape;

    public Border(Shape shape) {
        this.shape = shape;
    }

    public void drawAt(Position position) {
        shape.drawAt(position);
        System.out.println(" with border");
    }
}
