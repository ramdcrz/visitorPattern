package labAssignment4;

public class Chair implements Furniture {
    private String material; // e.g., Wood, Plastic

    public Chair(String material) {
        this.material = material;
    }

    public String getMaterial() { return material; }

    @Override
    public double accept(ShippingCalculator visitor) {
        return visitor.calculate(this);
    }
}