public class Main {

    public static void main(String[] args) {

        Order order = new Order(
                "o1",
                "c1",
                "Medellín",
                100,
                4
        );

        ShippingCalculator smart = new SmartShippingCalculator();

        ShippingCalculatorProxy proxy =
                new ShippingCalculatorProxy(smart);

        Checkout checkout = new Checkout(proxy);

        System.out.println("===== TIENDA =====");

        System.out.println("Ciudad: " + order.city());
        System.out.println("Subtotal: $" + order.subtotal());
        System.out.println("Peso: " + order.weightKg() + " kg");

        double total = checkout.total(order);

        System.out.println("Envío: $" + proxy.calculate(order));
        System.out.println("TOTAL: $" + total);

        System.out.println("==================");
    }
}