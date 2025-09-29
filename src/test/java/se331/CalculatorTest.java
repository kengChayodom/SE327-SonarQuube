package se331;

import org.junit.jupiter.api.Test;
import se321.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class CalculatorTest {

    @Test
     void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
     void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
     void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
     void testDivide() {
        Calculator calculator = new Calculator();
        // The last argument '0.01' is the delta for comparing double-precision numbers
        assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }
}