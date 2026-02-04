package module03;
/**
 * @author Hongkun Yi
 * Date: 1/28, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 03
 * * CodingBat Practice Problem: Array-1 front11
 * * Problem Description:
 * Given 2 int arrays, a and b, of any length, return a new array with 
 * the first element of each array. If either array is length 0, ignore that array.
 * * Examples:
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 * front11([1], [2]) → [1, 2]
 * front11([1, 7], []) → [1]
 * * Source: https://codingbat.com/prob/p128270
 */
package module03;

import java.util.Arrays;

public class Hongkun {
    
    public int[] front11(int[] a, int[] b) {
        int size = 0;
        if (a.length > 0) size++;
        if (b.length > 0) size++;
        
        int[] result = new int[size];
        int index = 0;
        if (a.length > 0) {
            result[index] = a[0];
            index++;
        }
        if (b.length > 0) {
            result[index] = b[0];
        }
        return result;
    }
    
    public static void main(String[] args) {
        Hongkun solution = new Hongkun();
        
        System.out.println(Arrays.toString(solution.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(solution.front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(solution.front11(new int[]{1, 7}, new int[]{})));
        System.out.println(Arrays.toString(solution.front11(new int[]{}, new int[]{2, 3})));
        System.out.println(Arrays.toString(solution.front11(new int[]{}, new int[]{})));
    }
}

