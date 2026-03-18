
/**
 * @author Bolin Zeng
 * @version  (Object-oriented programming)
 *
 * Date: 3/17, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 09
 *
 * Practice Problem: CodingBat - Recursion-1 > splitOdd10
 *
 * Problem Description:
 * Given an array of ints, determine if it is possible to divide the ints into
 * two groups such that the sum of one group is a multiple of 10, and the sum
 * of the other group is odd. Every int must be in one group or the other.
 *
 * splitOdd10([5, 5, 5]) → true
 * splitOdd10([5, 5, 6]) → false
 * splitOdd10([5, 5, 6, 1]) → true
 *
 * Input: nums (an array of integers)
 * Output: true if such a split exists, false otherwise.
 *
 * Source: CodingBat
 */



public class SplitOdd10 {
        private SplitOdd10(){}

    /**
     * Determines if the array can be split into two groups where
     * one group's sum is a multiple of 10 and the other's sum is odd.
     *
     * @param nums the input array of integers
     * @return true if a valid split exists, false otherwise
     */
    public static boolean splitOdd10(int[] nums) {
            return helper(nums, 0, 0, 0);
    }
    /**
     * Recursive helper that tries placing each element into group A or group B.
     *
     * @param nums  the input array of integers
     * @param index the current index being processed
     * @param sumA  the running sum of group A (target: multiple of 10)
     * @param sumB  the running sum of group B (target: odd)
     * @return true if a valid split is found, false otherwise
     */
    private static boolean helper(int[] nums, int index, int sumA, int sumB) {
        if (index == nums.length) {
            return sumA % 10 == 0 && sumB % 2 == 1;
        }
        if (helper(nums, index + 1, sumA + nums[index], sumB)) {
            return true;
        }
        if (helper(nums, index + 1, sumA, sumB + nums[index])) {
            return true;
        }
        return false;

    }
}