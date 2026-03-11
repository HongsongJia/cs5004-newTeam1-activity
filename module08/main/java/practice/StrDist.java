package java.practice;

/**
 * @author Bolin Zeng
 * @version  (Object-oriented programming)
 *
 * Date: 3/11, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 08
 *
 * Practice Problem: CodingBat - Recursion-1 > strDist
 *
 * Problem Description:
 * Given a string and a non-empty substring sub, compute recursively the largest
 * substring which starts and ends with sub and return its length.
 *
 * strDist("catcowcat", "cat") → 9
 * strDist("catcowcat", "cow") → 3
 * strDist("cccatcowcatxx", "cat") → 9
 *
 * Input: str (the original string), sub (the target substring)
 * Output: the length of the largest substring that starts and ends with sub.
 *
 * Source: CodingBat
 */
public class StrDist {

    private StrDist() {
    }

    /**
     *
     * @param str the original string.
     * @param sub the target substring.
     * @return the length of the largest substring starting and ending with sub.
     */
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        return str.length();
    }
}