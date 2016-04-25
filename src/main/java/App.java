import shapes.Position;

public class App {

    public static void main(String...args) {
        int yposition = 0;
        int xposition = 0;
        new App().runIt(new Position(yposition, xposition));
    }

    public void runIt(Position position) {
        new Shade(new Border(new Rectangle())).drawAt(position);
        System.out.println();
        new Rectangle().drawAt(position);
        System.out.println();
        new Circle().drawAt(position);
        System.out.println();
    }


}
