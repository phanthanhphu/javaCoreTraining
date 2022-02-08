package unittestexample;

import org.junit.Assert;
import org.testng.annotations.Test;
import unittest.Calculator;
import static org.hamcrest.CoreMatchers.is;

public class CalculatorTest {

    @Test
    public void testAssertEqualsAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAssertNotEqualsAdd() {
        Calculator calculator = new Calculator();
        Assert.assertNotEquals(5, calculator.add(3, 5));
    }

    @Test
    public void testAssertEqualsSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    public void testAssertNotEqualsSub() {
        Calculator calculator = new Calculator();
        Assert.assertNotEquals(7, calculator.add(4, 2));
    }

    @Test
    public void testAssertNotNull() {
        Calculator calculator = new Calculator();
        Assert.assertNotNull(calculator.testNotNull(3));
    }

    @Test
    public void testAssertTrue() {
        Calculator calculator = new Calculator();
        Assert.assertTrue(4 > calculator.add(1, 2));
    }

    @Test
    public void testAssertFalseAdd() {
        Calculator calculator = new Calculator();
        Assert.assertFalse(5 > calculator.add(5, 3));
    }

    @Test
    public void testAssertNull() {
        Calculator calculator = new Calculator();
        Assert.assertNull(calculator.testNull(null));
    }

    @Test
    public void testAssertThat() {
        Calculator calculator = new Calculator();
        Assert.assertThat(3, is(calculator.add(1, 2)));
    }
}