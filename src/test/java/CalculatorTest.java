package gusakova;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testDivision() {
        assertEquals(2, calculator.division(4, 2), 2);
    }


    @Test
    public void testDivisionNull() {
        assertEquals(0, calculator.division(0, 3), 0);
    }


    @Test(expected = ArithmeticException.class)
    public void testDivisionArithmetic() {
        calculator.division(2, 0);
    }


    @Test
    public void testDivisionMinus() {
        assertEquals(-1.5, calculator.division(-3, 2), -1.5);
    }

}
