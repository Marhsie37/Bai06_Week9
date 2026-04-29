package com.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple calculator with basic operations.
 * This class is used to demonstrate code coverage.
 */
public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    /**
     * Add two numbers.
     */
    public int add(int a, int b) {
        logger.debug("Adding {} + {}", a, b);
        return a + b;
    }

    /**
     * Subtract two numbers.
     */
    public int subtract(int a, int b) {
        logger.debug("Subtracting {} - {}", a, b);
        return a - b;
    }

    /**
     * Multiply two numbers.
     */
    public int multiply(int a, int b) {
        logger.debug("Multiplying {} * {}", a, b);
        return a * b;
    }

    /**
     * Divide two numbers.
     * @throws IllegalArgumentException if b == 0
     */
    public double divide(int a, int b) {
        if (b == 0) {
            logger.error("Division by zero: {} / {}", a, b);
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        logger.debug("Dividing {} / {}", a, b);
        return (double) a / b;
    }

    /**
     * Calculate factorial.
     * @throws IllegalArgumentException if n < 0
     */
    public long factorial(int n) {
        if (n < 0) {
            logger.error("Negative factorial: {}", n);
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        logger.info("{}! = {}", n, result);
        return result;
    }

    /**
     * Check if number is prime.
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate power.
     */
    public long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent not supported");
        }

        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}