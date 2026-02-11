/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 10, 2026
 *
 * CodingBat - Array-2 - centeredAverage
 *
 * Return the "centered" average of an array of ints,
 * which is the mean average of the values,
 * except ignoring the largest and smallest values in the array.
 * If there are multiple copies of the smallest value,
 * ignore just one copy, and likewise for the largest value.
 *
 * You may assume that the array length is 3 or more.
 */

public class YunmengzeFang {

    public int centeredAverage(int[] nums) {

        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        // One loop to calculate sum, min, and max
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Remove one smallest and one largest value
        sum = sum - min - max;

        return sum / (nums.length - 2);
    }
}
