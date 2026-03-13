package labAssignment4;

public class Sofa implements Furniture {
    private double distanceInKm;

    public Sofa(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public double getDistanceInKm() { return distanceInKm; }

    @Override
    public double accept(ShippingCalculator visitor) {
        return visitor.calculate(this);
    }
}