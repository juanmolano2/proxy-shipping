public class SmartShippingCalculator implements ShippingCalculator {

    @Override
    public double calculate(Order o) {
        double base = o.weightKg() * 2.5;

        if (!o.city().equalsIgnoreCase("Bogotá")) {
            base += 5.0;
        }

        return base;
    }
}