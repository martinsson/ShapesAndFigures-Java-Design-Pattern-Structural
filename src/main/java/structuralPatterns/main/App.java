package structuralPatterns.main;

import structuralPatterns.Shape;
import structuralPatterns.builder.ShapeBuilder;
import structuralPatterns.coordinates.Dimensions;
import structuralPatterns.Position;
import structuralPatterns.decorators.Border;
import structuralPatterns.decorators.Shade;
import structuralPatterns.figures.CompositeFigure;
import structuralPatterns.figures.LeafFigure;

public class App {


    public static void main(String...args) {
        App app = new App();
        app.runIt();
    }

    public  void runIt() {
        Shape complexRectangle = makeRectangle();
        Position figurePosition = new Position(1, 1);
        LeafFigure figure = new LeafFigure(complexRectangle, figurePosition);

        Shape complexCircle = makeCircle();
        LeafFigure figure2 = new LeafFigure(complexCircle, figurePosition);

        CompositeFigure compositeFigure = new CompositeFigure(figure, figure2, figurePosition);

        Position position = new Position(12, 13);
        compositeFigure.drawAt(position);
        System.out.println();

    }

    private Shape makeCircle() {
        int radius = 40;
        return new ShapeBuilder()
                .aCircle(radius)
                .with(new Border())
                .with(new Shade())
                .build();
    }

    private Shape makeRectangle() {
        int height = 250;
        int width = 400;
        Dimensions dimensions = new Dimensions(width, height) ;
        return new ShapeBuilder()
                .aRectangle(dimensions)
                .with(new Border())
                .with(new Shade())
                .build();
    }


}
