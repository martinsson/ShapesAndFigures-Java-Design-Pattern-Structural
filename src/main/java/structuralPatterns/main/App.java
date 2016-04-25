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
        int yposition = 0;
        int xposition = 0;
        Position position = new Position(yposition, xposition);


        int height = 250;
        int width = 400;
        Dimensions dimensions = new Dimensions(width, height) ;
        Shape complexShape = new ShapeBuilder()
                .aRectangle(dimensions)
                .with(new Border())
                .with(new Shade()).build();

        Position figurePosition = new Position(0, 0);
        LeafFigure figure = new LeafFigure(complexShape, figurePosition);

        figure.drawAt(figurePosition);


        System.out.println();
    }


}
