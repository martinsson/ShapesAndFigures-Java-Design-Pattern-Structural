import shapes.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Rectangle implements Shape {

    private Dimensions dimensions;

    public Rectangle(Dimensions dimensions) {

        this.dimensions = dimensions;
    }

    public void drawAt(Position position) {
        System.out.println("Rectangle with dimensions "  + dimensions.toString() + " ");
        System.out.println(" Drawn at " + position.toString());
    }
}
