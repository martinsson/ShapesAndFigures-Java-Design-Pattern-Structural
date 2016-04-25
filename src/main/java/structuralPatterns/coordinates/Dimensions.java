package structuralPatterns.coordinates;

/**
 * Created by johan on 25/04/16.
 */
public class Dimensions {
    private final int width;
    private final int height;

    public Dimensions(int width, int height) {

        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
