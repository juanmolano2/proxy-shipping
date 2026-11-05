public class ShippingCalculatorProxy implements ShippingCalculator {

    private final ShippingCalculator smart;

    public ShippingCalculatorProxy(ShippingCalculator smart) {
        this.smart = smart;
    }

    @Override
    public double calculate(Order order) {
        System.out.println("LOG: Utilizando SmartShippingCalculator");
        return smart.calculate(order);
    }
}