package structuralPatterns.shape;

import structuralPatterns.Shape;
import structuralPatterns.coordinates.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Circle implements Shape {
    public void drawAt(Position position) {
        System.out.print("structuralPatterns.shape.Circle ");
        System.out.println("Drawn at " + position.toString());

    }
}