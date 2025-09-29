package se331;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import se.se321.AdvancedCalculator;
import se.se321.Calculator;

class AdvancedCalculatorTest {

    @Test
    void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(8.0, calculator.power(2, 3), 0.01);
    }

    @Test
    void testSqrt() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(2.0, calculator.sqrt(4), 0.01);
    }

    @Test
    void testSqrtNegative_shouldThrow() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sqrt(-1)
        );
        assertEquals("Cannot calculate square root of a negative number.", ex.getMessage());
    }

    @Test
    void testDivideByZero_shouldThrow() {
        Calculator calculator = new Calculator();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("Division by zero is not allowed.", ex.getMessage());
    }
}