public class ShippingCalculatorProxy implements ShippingCalculator {

    private final ShippingCalculator smart;

    public ShippingCalculatorProxy(ShippingCalculator smart) {
        this.smart = smart;
    }

    @Override
    public double calculate(Order order) {

        long inicio = System.nanoTime();

        double resultado = smart.calculate(order);

        double tiempoMs = (System.nanoTime() - inicio) / 1_000_000.0;

        System.out.printf(
                "LOG: Utilizando SmartShippingCalculator - Tiempo: %.3f ms%n",
                tiempoMs
        );

        return resultado;
    }
}