package shapes;

import coordinates.Position;

/**
 * Created by johan on 25/04/16.
 */
public class Rectangle implements Shape {

    public void drawAt(Position position) {
        System.out.print("shapes.Rectangle ");
        System.out.println("Drawn at " + position.toString());
    }
}
