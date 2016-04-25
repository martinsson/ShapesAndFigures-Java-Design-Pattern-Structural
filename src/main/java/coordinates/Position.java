package coordinates;

public class Position {
    private final int yposition;
    private final int xposition;

    public Position(int yposition, int xposition) {
        this.yposition = yposition;
        this.xposition = xposition;
    }

    public int getYposition() {
        return yposition;
    }

    public int getXposition() {
        return xposition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "yposition=" + yposition +
                ", xposition=" + xposition +
                '}';
    }
}
