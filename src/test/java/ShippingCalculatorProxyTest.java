import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShippingCalculatorProxyTest {

    Order order = new Order("o1", "c1", "Medellín", 100, 4);

    ShippingCalculatorProxy proxy = new ShippingCalculatorProxy(
            new SmartShippingCalculator()
    );

    @Test
    void usaSmartShippingCalculator() {
        assertEquals(15.0, proxy.calculate(order));
    }

    @Test
    void checkoutFuncionaConElProxy() {
        Checkout checkout = new Checkout(proxy);
        assertEquals(115.0, checkout.total(order));
    }

    @Test
    void checkoutFuncionaConCualquierCalculador() {
        Checkout checkout = new Checkout(o -> 7.0);
        assertEquals(107.0, checkout.total(order));
    }
}