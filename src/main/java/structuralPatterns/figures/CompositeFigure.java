package structuralPatterns.figures;

import structuralPatterns.Shape;
import structuralPatterns.Position;

/**
 * Created by johan on 25/04/16.
 */
public class CompositeFigure implements Shape {
    private final Shape shape1;
    private final Shape shape2;
    private final Position figurePosition;

    public CompositeFigure(Shape shape1, Shape shape2, Position figurePosition) {

        this.shape1 = shape1;
        this.shape2 = shape2;
        this.figurePosition = figurePosition;
    }

    public void drawAt(Position position) {
        System.out.println("Drawing composite figures at " + figurePosition);
        System.out.println(" Containing both " );
        shape1.drawAt(position);
        System.out.println(" And " );
        shape2.drawAt(position);

    }
}
