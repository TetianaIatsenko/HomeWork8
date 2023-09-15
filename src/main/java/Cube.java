public class Cube extends Shape implements VolumetricFigures{
    private static final String NAME = "Cube";
    private double a;

    /**
     *
     * @param a side of a cube
     */
    public Cube(double a) {
        this.a = a;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }
}
