/**
 * @author Bolin Zeng
 * Date: 2/4, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 04
 *
 * Practice Problem: Recursive Factorial Calculation
 *
 * Problem Description:
 * Write a recursive method that calculates the factorial of a given non-negative integer.
 * The factorial of a number n (written as n!) is the product of all positive integers
 * less than or equal to n. By definition, 0! = 1 and 1! = 1.
 * The recursive formula is: n! = n × (n-1)!
 *
 * Examples:
 * factorial(0) → 1
 * factorial(1) → 1
 * factorial(5) → 120 (5 × 4 × 3 × 2 × 1)
 * factorial(10) → 3628800
 *
 * Source: [CodingBat, recursion]
 */
public class Bolin {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}