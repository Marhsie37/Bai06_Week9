package com.math;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive tests for Calculator class.
 * Designed to achieve >80% code coverage.
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Arithmetic Operations Tests")
    class ArithmeticTests {

        @Test
        @DisplayName("Test addition")
        void testAdd() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(-1, calculator.add(2, -3));
            assertEquals(0, calculator.add(0, 0));
        }

        @Test
        @DisplayName("Test subtraction")
        void testSubtract() {
            assertEquals(2, calculator.subtract(5, 3));
            assertEquals(-2, calculator.subtract(3, 5));
            assertEquals(0, calculator.subtract(5, 5));
        }

        @Test
        @DisplayName("Test multiplication")
        void testMultiply() {
            assertEquals(15, calculator.multiply(3, 5));
            assertEquals(0, calculator.multiply(0, 10));
            assertEquals(-10, calculator.multiply(-2, 5));
        }

        @Test
        @DisplayName("Test division - normal cases")
        void testDivide() {
            assertEquals(2.0, calculator.divide(10, 5));
            assertEquals(2.5, calculator.divide(5, 2));
            assertEquals(-2.0, calculator.divide(-10, 5));
        }

        @Test
        @DisplayName("Test division - exception on zero")
        void testDivideByZero() {
            assertThrows(IllegalArgumentException.class,
                    () -> calculator.divide(10, 0));
        }
    }

    @Nested
    @DisplayName("Advanced Operations Tests")
    class AdvancedTests {

        @Test
        @DisplayName("Test factorial - normal values")
        void testFactorial() {
            assertEquals(1, calculator.factorial(0));
            assertEquals(1, calculator.factorial(1));
            assertEquals(120, calculator.factorial(5));
            assertEquals(720, calculator.factorial(6));
        }

        @Test
        @DisplayName("Test factorial - exception on negative")
        void testFactorialNegative() {
            assertThrows(IllegalArgumentException.class,
                    () -> calculator.factorial(-1));
            assertThrows(IllegalArgumentException.class,
                    () -> calculator.factorial(-5));
        }

        @Test
        @DisplayName("Test prime checking")
        void testIsPrime() {
            // Edge cases
            assertFalse(calculator.isPrime(0));
            assertFalse(calculator.isPrime(1));

            // Prime numbers
            assertTrue(calculator.isPrime(2));
            assertTrue(calculator.isPrime(3));
            assertTrue(calculator.isPrime(5));
            assertTrue(calculator.isPrime(7));
            assertTrue(calculator.isPrime(11));
            assertTrue(calculator.isPrime(13));

            // Non-prime numbers
            assertFalse(calculator.isPrime(4));
            assertFalse(calculator.isPrime(6));
            assertFalse(calculator.isPrime(8));
            assertFalse(calculator.isPrime(9));
            assertFalse(calculator.isPrime(10));
            assertFalse(calculator.isPrime(15));
        }

        @Test
        @DisplayName("Test power calculation")
        void testPower() {
            assertEquals(1, calculator.power(5, 0));
            assertEquals(5, calculator.power(5, 1));
            assertEquals(25, calculator.power(5, 2));
            assertEquals(125, calculator.power(5, 3));
            assertEquals(0, calculator.power(0, 5));
            assertEquals(1, calculator.power(0, 0));
        }

        @Test
        @DisplayName("Test power - negative exponent exception")
        void testPowerNegativeExponent() {
            assertThrows(IllegalArgumentException.class,
                    () -> calculator.power(5, -1));
        }
    }
}