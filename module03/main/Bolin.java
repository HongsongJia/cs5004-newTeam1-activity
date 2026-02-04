

/**
 * @author Bolin Zeng
 * Date: 2/4, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 03
 *
 * Practice Problem: Recursive Factorial Calculation
 *
 * Problem Description:
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target? This is a classic backtracking
 * recursion problem. Once you understand the recursive backtracking strategy in
 * this problem, you can use the same pattern for many problems to search a space
 * of choices. Rather than looking at the whole array, our convention is to consider
 * the part of the array starting at index start and continuing to the end of the array.
 * The caller can specify the whole array simply by passing start as 0. No loops
 * are needed -- the recursive calls progress down the array.
 *
 * Examples:
 * groupSum(0, [2, 4, 8], 10) → true
 * groupSum(0, [2, 4, 8], 14) → true
 * groupSum(0, [2, 4, 8], 9) → false
 *
 * Source: [CodingBat, recursion]
 */
public class Bolin{

public boolean bolin(int start, int[] nums, int target) {
    System.out.println("start=" + start + ", target=" + target);
    if (target == 0)
        return true;
    if (start >= nums.length)
        return false;
    if (bolin(start + 1, nums, target - nums[start]))
        return true;
    if (bolin(start + 1, nums, target))
        return true;
    return false;
}

    public static void main(String[] args) {
    Bolin gs = new Bolin();

    int[] nums = {2, 4, 8};
    boolean result = gs.bolin(0, nums, 10);
    System.out.println(result);
}
}