public class SmartShippingCalculator implements ShippingCalculator {

    @Override
    public double calculate(Order o) {
        double base = o.weightKg() * 2.5;
        return base;
    }
}