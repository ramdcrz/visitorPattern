package labAssignment4;

public class StandardShipping implements ShippingCalculator {

    @Override
    public double calculate(Chair chair) {
        // Chairs have a flat rate, but maybe plastic is cheaper to ship
        if (chair.getMaterial().equalsIgnoreCase("Plastic")) {
            return 150.0;
        }
        return 250.0; // Flat rate for other chairs
    }

    @Override
    public double calculate(Table table) {
        // Tables are priced based on weight (e.g., 20.0 per kg)
        return table.getWeight() * 20.0;
    }

    @Override
    public double calculate(Sofa sofa) {
        // Sofas are bulky; cost is based on distance (e.g., 50.0 per km)
        return sofa.getDistanceInKm() * 50.0;
    }
}