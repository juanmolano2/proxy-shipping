public class ShippingCalculatorProxy implements ShippingCalculator {

    private final ShippingCalculator legacy;
    private final ShippingCalculator smart;
    private final FeatureFlags flags;

    public ShippingCalculatorProxy(ShippingCalculator legacy,
                                   ShippingCalculator smart,
                                   FeatureFlags flags) {
        this.legacy = legacy;
        this.smart = smart;
        this.flags = flags;
    }

    @Override
    public double calculate(Order order) {

        if (flags.isEnabled("smart-shipping")) {
            System.out.println("LOG: Utilizando SmartShippingCalculator");
            return smart.calculate(order);
        } else {
            System.out.println("LOG: Utilizando LegacyShippingCalculator");
            return legacy.calculate(order);
        }
    }
}