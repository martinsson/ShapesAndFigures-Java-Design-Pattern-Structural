package structuralPatterns.main;

import structuralPatterns.coordinates.Position;
import structuralPatterns.figure.Figure;
import structuralPatterns.decorators.Border;
import structuralPatterns.decorators.Shade;
import structuralPatterns.shape.Circle;
import structuralPatterns.shape.Rectangle;
import structuralPatterns.Shape;
import structuralPatterns.builder.ShapeBuilder;

public class App {

    public static void main(String...args) {
        int yposition = 0;
        int xposition = 0;
        new App().runIt(new Position(yposition, xposition));
    }

    public void runIt(Position position) {



        Shape complexShape = new ShapeBuilder()
                .aRectangle()
                .with(new Border())
                .with(new Shade()).build();

        complexShape.drawAt(position);

        Position figurePosition = new Position(2, 3);
        new Figure(complexShape, figurePosition);

        System.out.println();

        new Shade(new Border(new Rectangle()))
                .drawAt(position);

        System.out.println();
        new Rectangle().drawAt(position);
        System.out.println();
        new Circle().drawAt(position);
        System.out.println();
    }


}
