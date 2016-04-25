import com.sun.prism.shader.DrawCircle_LinearGradient_PAD_Loader;
import shapes.Position;

public class App {

    public static void main(String...args) {
        new App().runIt();
    }

    public void runIt() {

        int yposition = 0;
        int xposition = 0;
        Position position = new Position(yposition, xposition);



        int height = 44;
        int width = 30;
        Dimensions dimensions = new Dimensions(width, height);


        Rectangle rectangle = new Rectangle(dimensions);
        Circle circle = new Circle(10);
        

        draw(circle, position, dimensions);
        

    }

    private void draw(Shape shape, Position position, Dimensions dimensions) {
        shape.drawAt(position);
        if (shape instanceof Circle) {
            drawCircle(position);
        } else if (shape instanceof Rectangle) {
            drawRectangle(position, dimensions);
        }
    }

    private void drawRectangle(Position position, Dimensions dimensions) {
        System.out.print("Rectangle with dimensions "  + dimensions.toString() + " ");
        System.out.println("Drawn at " + position.toString());
    }

    private void drawCircle(Position position) {
        System.out.print("Circle ");
        System.out.println("Drawn at " + position.toString());
    }


}
