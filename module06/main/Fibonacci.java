/**
 * @author Bolin Zeng
 * Date: 2/18, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 06
 *
 * Practice Problem: CodingBat - Recursion-1 > fibonacci
 *
 * Problem Description:
 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a
 * recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base
 * cases). Each subsequent value is the sum of the previous two values, so the whole
 * sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method
 * that returns the nth fibonacci number, with n=0 representing the start of the sequence.

 * fibonacci(0) → 0
 * fibonacci(1) → 1
 * fibonacci(2) → 1
 *
 * Input: x(the xth Fibonacci array)
 * Output: x value

 * Source: CodingBat
 */
public class Fibonacci {
    int x;
    Fibonacci(int x) {
        this.x = x;
    }
    public static int fibonacci(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
