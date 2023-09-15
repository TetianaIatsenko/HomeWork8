public class Triangle extends Shape implements FlatFigures{
    private static final String NAME = "Triangle";
    private double a;
    private double h;

    /**
     *
     * @param a side of a triangle
     * @param h height of triangle to side
     */
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return 0.5 * a * h;
    }
}
