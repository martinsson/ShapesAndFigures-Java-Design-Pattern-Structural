import shapes.Position;

public class App {

    public static void main(String...args) {
        int yposition = 0;
        int xposition = 0;
        new App().runIt(new Position(yposition, xposition));
    }

    public void runIt(Position position) {
        new Rectangle().drawAt(position);
        new Circle().drawAt(position);
    }


}
