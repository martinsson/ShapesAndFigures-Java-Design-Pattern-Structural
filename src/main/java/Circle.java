import shapes.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Circle implements Shape{
    public void drawAt(Position position) {
        System.out.print("Circle ");
        System.out.println("Drawn at " + position.toString());

    }
}
