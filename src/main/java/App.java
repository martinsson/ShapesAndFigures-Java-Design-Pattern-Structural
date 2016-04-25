import shapes.Position;

public class App {

    public static void main(String...args) {
        new App().runIt();
    }

    public void runIt() {
        int height = 44;
        int width = 30;
        Dimensions dimensions = new Dimensions(width, height);
        Rectangle rectangle = new Rectangle(dimensions);

        int yposition = 0;
        int xposition = 0;
        Position position = new Position(yposition, xposition);
        drawShape(position, rectangle);


        drawShape(position, new Circle(10));
    }

    private void drawShape(Position position, Shape rectangle) {

        rectangle.drawAt(position);
    }


}
