import java.util.HashMap;
import java.util.Map;

/**
 * Utility class that solves LeetCode 1: Two Sum.
 *
 * <p>Given an integer array {@code nums} and an integer {@code target},
 * return indices of the two numbers such that they add up to {@code target}.
 *
 * <p>Assumptions (per LeetCode 1):
 * <ul>
 *   <li>Each input has exactly one solution.</li>
 *   <li>You may not use the same element twice.</li>
 *   <li>The answer can be returned in any order.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * nums = [2, 7, 11, 15], target = 9
 * return [0, 1]  // because nums[0] + nums[1] = 2 + 7 = 9
 * </pre>
 *
 * <p>Algorithm:
 * Use a hash map to store previously seen values and their indices.
 * For each element {@code nums[i]}, compute {@code complement = target - nums[i]}.
 * If {@code complement} has been seen before, return the stored index and {@code i}.
 * Otherwise, store {@code nums[i] -> i} and continue.
 *
 * <p>Time Complexity: O(n)
 * <br>Space Complexity: O(n)
 *
 * @author HongsongJia
 * @version Object-orinted programming
 * Date: 2/25, 2026
 */
class TwoSum {
    /**
     * Returns indices of the two numbers such that they add up to {@code target}.
     *
     * @param nums the input array
     * @param target the target sum
     * @return an array of length 2 containing the two indices
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if(nums == null || nums.length == 0){
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                result[0] = i;
                result[1] = map.get(temp);
                break;
            }
            map.put(nums[i], i);
        }
        return  result;
    }
}