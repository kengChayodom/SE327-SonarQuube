

import org.junit.jupiter.api.Test;
import se321.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        // The last argument '0.01' is the delta for comparing double-precision numbers
        assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }
}