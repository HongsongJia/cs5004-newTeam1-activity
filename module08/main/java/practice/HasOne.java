package java.practice;

/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 2/23/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 07
 *
 * Practice Problem: CodingBat - AP-1 - hasOne
 *
 * Problem Description:
 * 
 * Given a positive int n, return true if it contains a 1 digit. 
 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.

 * Examples:
 * hasOne(10) → true
 * hasOne(22) → false
 * hasOne(220) → false

 * Source: CodeHS 
 */
public class HasOne {
    /**
     * Returns true if n contains a 1 digit, false otherwise.
     *
     * @param n the positive integer to check
     * @return true if n contains a 1 digit, false otherwise 
     */
    public static boolean hasOne(int n) {
        if (n < 0) n = -n;

        while (n > 0) {
            if (n % 10 == 1) return true;
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasOne(10));  // true
        System.out.println(hasOne(22));  // false
        System.out.println(hasOne(220)); // false
        System.out.println(hasOne(1));   // true
        System.out.println(hasOne(449));   // false
    }
}
//javac java.practice.HasOne.java
//java java.practice.HasOne