package practice;

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