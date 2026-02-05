/**
 * Date: 02/04/2026
 * Course: CS5004
 * Team: Team 2
 * Module: 04
 *
 * CodingBat Practice Problem: String-1 makeAbba
 *
 * Problem Description:
 * Given two strings, a and b, return the result of putting them together
 * in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 *
 * Examples:
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 *
 * Source: https://codingbat.com/prob/p161056
 *
 * @author Hongkun
 */

public class Hongkun {

    /**
     * Returns the result of putting two strings together in the order abba.
     *
     * @param a the first string
     * @param b the second string
     * @return concatenated string in abba order
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}