/**
 * @author Bolin Zeng
 * Date: 2/11, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 05
 *
 * Practice Problem: Recursion-1 > noX
 *
 * Problem Description:
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 *
 * Examples:
 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
 *
 * Source: [CodingBat, recursion]
 */
public class Bolin {
    public static String nox(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return nox(str.substring(1));
        } else {
            return str.charAt(0) + nox(str.substring(1));
        }
    }
}