package structuralPatterns.main;

import structuralPatterns.Shape;
import structuralPatterns.builder.ShapeBuilder;
import structuralPatterns.coordinates.Dimensions;
import structuralPatterns.coordinates.Position;
import structuralPatterns.decorators.Border;
import structuralPatterns.decorators.Shade;

public class App {

    public static void main(String...args) {
        App app = new App();
        app.runIt();
    }

    private  void runIt() {
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

        complexShape.drawAt(position);

        Position figurePosition = new Position(2, 3);
//        Figure figure = new Figure(complexShape, figurePosition);


        System.out.println();
    }


}
