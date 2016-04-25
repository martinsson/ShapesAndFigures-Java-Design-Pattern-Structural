import shapes.Position;

public class App {

    public static void main(String...args) {
        int yposition = 0;
        int xposition = 0;
        new App().runIt(new Position(yposition, xposition));
    }

    public void runIt(Position position) {
        int height = 44;
        int width = 30;
        Dimensions dimensions = new Dimensions(width, height);
        Rectangle rectangle = new Rectangle(dimensions);
        int radius = 3;
        Circle circle = new Circle(radius);

        drawShape(position, rectangle);
        drawShape(position, circle);
    }

    private void drawShape(Position position, Shape rectangle) {
        rectangle.drawAt(position);
    }


}
