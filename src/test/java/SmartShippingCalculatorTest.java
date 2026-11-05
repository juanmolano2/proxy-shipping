import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmartShippingCalculatorTest {

    @Test
    void calculaEnvioPorPeso() {

        Order order = new Order("o1", "c1", "Medellín", 100, 4);

        SmartShippingCalculator calculator = new SmartShippingCalculator();

        assertEquals(10.0, calculator.calculate(order));
    }
}