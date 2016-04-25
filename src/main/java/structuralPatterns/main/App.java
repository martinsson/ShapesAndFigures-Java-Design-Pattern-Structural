package structuralPatterns.main;

import structuralPatterns.Shape;
import structuralPatterns.builder.ShapeBuilder;
import structuralPatterns.coordinates.Dimensions;
import structuralPatterns.coordinates.Position;
import structuralPatterns.decorators.Border;
import structuralPatterns.decorators.Shade;
import structuralPatterns.figure.LeafFigure;

public class App {

    public static void main(String...args) {
        App app = new App();
        app.runIt();
    }

    public  void runIt() {
        int yposition = 12;
        int xposition = 13;
        Position position = new Position(yposition, xposition);


        int height = 250;
        int width = 400;
        Dimensions dimensions = new Dimensions(width, height) ;
        Shape complexShape = new ShapeBuilder()
                .aRectangle(dimensions)
                .with(new Border())
                .with(new Shade()).build();

        Position figurePosition = new Position(1, 1);
        LeafFigure figure = new LeafFigure(complexShape, figurePosition);

        figure.drawAt(position);


        System.out.println();
    }


}
