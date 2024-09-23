package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MathTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MathTest(String testName) {
        super(testName);
    }

    /**
     * Test addition
     * <br>
     * Given-When-Then
     */
    public void testAddition() {
        // Given
        int a = 1;
        int b = 2;
        // When
        int result = Math.addition(a, b);
        // Then
        assertEquals(3, result);
    }

    /**
     * Test division
     * <br>
     * Given-When-Then
     */
    public void testDivision() {
        // Given
        int a = 6;
        int b = 2;
        // When
        int result = Math.division(a, b);
        // Then
        assertEquals(3, result);
    }

    /**
     * Test countMultiples
     * <br>
     * Given-When-Then
     */
    public void testCountMultiples() {
        // Given
        int a = 6;
        // When
        int result = Math.countMultiples(a);
        // Then
        assertEquals(4, result);
    }
}
