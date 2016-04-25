/**
 * Created by johan on 25/04/16.
 */
public class ShapeBuilder {

    private Shape mainShape;

    public ShapeBuilder aRectangle() {
        mainShape = new Rectangle();
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
}
