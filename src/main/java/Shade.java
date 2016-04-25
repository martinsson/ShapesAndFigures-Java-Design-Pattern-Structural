import shapes.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Shade implements Shape {
    private Shape otherShape;

    public Shade(Shape otherShape) {
        this.otherShape = otherShape;
    }

    public void drawAt(Position position) {
        otherShape.drawAt(position);
        System.out.println(" with shade");
    }
}
