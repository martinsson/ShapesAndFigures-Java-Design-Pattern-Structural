package structuralPatterns.builder;

import com.oracle.webservices.internal.api.message.ContentType;
import structuralPatterns.Shape;
import structuralPatterns.ShapeDecorator;
import structuralPatterns.coordinates.Dimensions;
import structuralPatterns.shape.Circle;
import structuralPatterns.shape.Rectangle;

/**
 * Created by johan on 25/04/16.
 */
public class ShapeBuilder {

    private Shape mainShape;

    public ShapeBuilder aRectangle(Dimensions dimensions) {
        mainShape = new Rectangle(dimensions);
        return this;
    }

    public ShapeBuilder with(ShapeDecorator shapeDecorator) {

        shapeDecorator.setShape(mainShape);
        mainShape =shapeDecorator;
        return this;
    }

    public Shape build() {
        return mainShape;
    }

    public ShapeBuilder aCircle(int radius) {
        mainShape = new Circle(radius);
        return this;
    }
}
