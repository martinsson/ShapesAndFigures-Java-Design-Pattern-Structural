package structuralPatterns.shapes;

import structuralPatterns.Shape;
import structuralPatterns.coordinates.Dimensions;
import structuralPatterns.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Rectangle implements Shape {

    private Dimensions dimensions;

    public Rectangle(Dimensions dimensions) {

        this.dimensions = dimensions;
    }

    public void drawAt(Position position) {
        String dim = " of dimensions ";
        System.out.println("Rectangle ");
        System.out.println(dim + dimensions.toString());
        System.out.println(" Drawn at " + position.toString());
    }
}
