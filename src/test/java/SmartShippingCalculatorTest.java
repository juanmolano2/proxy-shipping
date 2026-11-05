import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmartShippingCalculatorTest {

    @Test
    void calculaEnvioPorPeso() {

        Order order = new Order("o1", "c1", "Bogotá", 100, 4);

        SmartShippingCalculator calculator = new SmartShippingCalculator();

        assertEquals(10.0, calculator.calculate(order));
    }

    @Test
    void sumaCincoSiLaCiudadNoEsBogota() {

        Order order = new Order("o2", "c2", "Medellín", 100, 4);

        SmartShippingCalculator calculator = new SmartShippingCalculator();

        assertEquals(15.0, calculator.calculate(order));
    }
}