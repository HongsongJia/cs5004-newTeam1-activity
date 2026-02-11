import java.util.Map;
import java.util.HashMap;


/**
 * @author HongsongJIa
 * Date: 2/11, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 05
 *
 * Practice Problem: LeetCode 1 - Two Sum
 *
 * Problem Description:
 * Given an array of integers `nums` and an integer `target`, return the indices
 * of the two numbers such that they add up to `target`.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Examples:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 *
 * Source: LeetCode
 */
public class Hongsong {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            if(nums == null || nums.length == 0){return result;}
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i< nums.length; i++){
                int temp = target - nums[i];
                if(map.containsKey(temp)){
                    result[0] = i;
                    result[1] = map.get(temp);
                    break;
                }
                map.put(nums[i], i);
            }
            return result;
        }
    }
