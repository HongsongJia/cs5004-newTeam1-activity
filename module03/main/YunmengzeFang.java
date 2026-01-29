/**
 * Date: 01/23/2026
 * Course: CS5004
 * Team: Team 2
 * Module: 03
 *
 * CodingBat Practice Problem: Array-1 makeEnds
 *
 * Problem Description:
 * Given an array of integers, return a new array of length 2
 * containing the first and last elements from the original array.
 * The original array will be length 1 or more.
 *
 * Examples:
 * makeEnds([1, 2, 3]) → [1, 3]
 * makeEnds([7, 4, 6, 2]) → [7, 2]
 *
 * Source: https://codingbat.com/prob/p101230
 *
 * @author YunmengzeFang
 */

public class YunmengzeFang {

    /**
     * Returns a new array containing the first and last elements
     * of the input array.
     *
     * @param nums the input integer array (length >= 1)
     * @return a new array with the first and last elements
     */
    public int[] makeEnds(int[] nums) {
        int[] result = new int[2];
        result[0] = nums[0];
        result[1] = nums[nums.length - 1];
        return result;
    }

}
