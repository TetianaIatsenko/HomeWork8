public class Sphere extends Shape implements VolumetricFigures{
    private static final String NAME = "Sphere";
    private double r;

    /**
     *
     * @param r radius of a Sphere
     */
    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * r * r * r;
    }
}
