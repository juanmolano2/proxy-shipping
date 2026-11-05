import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShippingCalculatorProxyTest {

    @Test
    void usaLegacyConFlagApagado() {

        Order order = new Order("o1", "c1", "Medellín", 100, 4);

        FeatureFlags flags = new FeatureFlags();

        ShippingCalculatorProxy proxy = new ShippingCalculatorProxy(
                new LegacyShippingCalculator(),
                o -> 0.0,
                flags
        );

        assertEquals(10.0, proxy.calculate(order));
    }
}