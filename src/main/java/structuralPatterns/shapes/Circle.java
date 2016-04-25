package structuralPatterns.shapes;

import structuralPatterns.Shape;
import structuralPatterns.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void drawAt(Position position) {
        System.out.println("Circle with radius "  + radius);
        System.out.println(" Drawn at " + position.toString());

    }
}
