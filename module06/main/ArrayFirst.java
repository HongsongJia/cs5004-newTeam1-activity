/**
 * @author Yanshi Liu
 * Date: 2/18, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 06
 *
 * Practice Problem: CodeHS - Array- Array First Element
 *
 * Problem Description:
 * Write a method that returns the first element of a String[] array.
 * If there is no first element in the array, return the empty String “”.

 * Examples:
 * Input: firstElement(new String[]{"hello", "world"})
 * Output: "hello"

 *
 * Input: firstElement(new String[0])
 * Output: ""

 * Source: CodeHS 
 */
public class ArrayFirst {
    /**
     * Returns the first element of the array; if none exists, returns "".
     *
     * @param words input array (may be null or empty)
     * @return first element or empty string
     */
    public static String firstElement(String[] words) {
        if (words == null || words.length == 0 || words[0] == null) {
            return "";
        }
        return words[0];
    }
    
    public static void main(String[] args) {
        System.out.println(firstElement(new String[]{"hello", "world"})); // hello
        System.out.println(firstElement(new String[0]));                  // ""
    }
}

//