package structuralPatterns.figures;

import structuralPatterns.Position;
import structuralPatterns.Shape;

/**
 * Created by johan on 25/04/16.
 */
public class LeafFigure implements Shape {
    private Shape shape;
    private Position figurePosition;

    public LeafFigure(Shape shape, Position figurePosition) {

        this.shape = shape;
        this.figurePosition = figurePosition;
    }

    public void drawAt(Position position) {
        System.out.println("Drawing figures at " + figurePosition);
        System.out.println(" Containing ");
        shape.drawAt(position);
    }
}
