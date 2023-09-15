public class Circle extends Shape implements FlatFigures{
    private static final String NAME = "Circle";
    private double r;

    /**
     *
     * @param r circle radius
     */
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
