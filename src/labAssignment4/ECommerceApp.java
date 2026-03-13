package labAssignment4;

import java.util.ArrayList;
import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        // Create a list of furniture items in the cart
        List<Furniture> cart = new ArrayList<>();
        cart.add(new Chair("Wood"));
        cart.add(new Table(15.5)); // 15.5 kg
        cart.add(new Sofa(10.0));  // 10 km distance

        // Create the shipping visitor
        ShippingCalculator shippingVisitor = new StandardShipping();

        double totalShipping = 0;

        System.out.println("--- Shipping Calculation Breakdown ---");
        for (Furniture item : cart) {
            double cost = item.accept(shippingVisitor);
            
            // Just for display clarity:
            String type = item.getClass().getSimpleName();
            System.out.println("Shipping cost for " + type + ": " + cost);
            
            totalShipping += cost;
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Shipping Cost: " + totalShipping);
    }
}