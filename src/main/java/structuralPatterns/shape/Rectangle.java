package structuralPatterns.shape;

import structuralPatterns.Shape;
import structuralPatterns.coordinates.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Rectangle implements Shape {

    public void drawAt(Position position) {
        System.out.print("structuralPatterns.shape.Rectangle ");
        System.out.println("Drawn at " + position.toString());
    }
}
