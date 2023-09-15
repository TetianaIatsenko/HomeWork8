public class Quad extends Shape implements FlatFigures{
    private static final String NAME = "Quad";

    private double a;

    /**
     *
     * @param a side of a square
     */
    public Quad(double a){
        this.a = a;
    }
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
