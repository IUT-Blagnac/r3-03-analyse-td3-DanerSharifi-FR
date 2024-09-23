package com.iutblagnac.r303trace;

public class Math {
    /**
     * Addition of two integers
     *
     * @param a The first integer
     * @param b The second integer
     * @return a + b
     */
    public static int addition(int a, int b) {
        return a + b;
    }

    /**
     * Division of two integers
     *
     * @param a The first integer
     * @param b The second integer
     * @return a / b
     */
    public static int division(int a, int b) {
        return a / b;
    }

    /**
     * Count the number of multiples
     *
     * @param a The integer
     * @return The number of multiples
     */
    public static int countMultiples(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }
}
