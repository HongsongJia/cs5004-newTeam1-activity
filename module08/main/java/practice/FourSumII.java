package practice;

/**
 * Utility class that solves LeetCode 454: 4Sum II.
 *
 * <p>Given four integer arrays {@code nums1}, {@code nums2}, {@code nums3}, and {@code nums4},
 * each of length {@code n}, return the number of tuples {@code (i, j, k, l)} such that
 * {@code nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0}.
 *
 * <p>Assumptions (per LeetCode 454):
 * <ul>
 *   <li>All four arrays have the same length {@code n}.</li>
 *   <li>Tuples are counted with repetition (indices matter, not values).</li>
 *   <li>The answer is guaranteed to fit in a 32-bit integer.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * nums1 = [1, 2], nums2 = [-2, -1], nums3 = [-1, 2], nums4 = [0, 2]
 * return 2
 * // (0,0,0,0): 1 + (-2) + (-1) + 0 = -2  ✗
 * // (0,0,0,1): 1 + (-2) + (-1) + 2 =  0  ✓
 * // (1,1,0,0): 2 + (-1) + (-1) + 0 =  0  ✓
 * </pre>
 *
 * <p>Algorithm:
 * Split the four arrays into two pairs. Use a hash map to record every possible
 * sum {@code nums1[i] + nums2[j]} along with its frequency.
 * Then, for every pair {@code (k, l)}, look up whether {@code -(nums3[k] + nums4[l])}
 * exists in the map and accumulate the corresponding count into the result.
 *
 * <p>Time Complexity: O(n²)
 * <br>Space Complexity: O(n²)
 *
 * @author HongsongJia
 * @version Object-oriented programming
 * Date: 3/4/2026
 */
import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i : nums1) {
            for (int j : nums2) {
                myMap.put(i + j, 1 + myMap.getOrDefault(i + j, 0));
            }
        }

        for (int i : nums3) {
            for (int j : nums4) {
                result += myMap.getOrDefault(0 - i - j, 0);
            }
        }
        return result;
    }
}