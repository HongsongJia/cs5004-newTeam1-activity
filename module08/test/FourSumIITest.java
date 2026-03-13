import org.junit.Test;

import practice.FourSumII;

import static org.junit.Assert.assertEquals;

public class FourSumIITest {

    @Test
    public void testExample1() {
        FourSumII s = new FourSumII();

        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(2, res);
    }

    @Test
    public void testAllZerosSingleElement() {
        FourSumII s = new FourSumII();

        int[] nums1 = {0};
        int[] nums2 = {0};
        int[] nums3 = {0};
        int[] nums4 = {0};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(1, res);
    }

    @Test
    public void testNoValidTuple() {
        FourSumII s = new FourSumII();

        int[] nums1 = {1};
        int[] nums2 = {1};
        int[] nums3 = {1};
        int[] nums4 = {1};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(0, res);
    }

    @Test
    public void testWithDuplicates() {
        FourSumII s = new FourSumII();

        int[] nums1 = {1, 1};
        int[] nums2 = {-1, -1};
        int[] nums3 = {0, 0};
        int[] nums4 = {0, 0};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(16, res);
    }

    @Test
    public void testNegativeAndPositiveMix() {
        FourSumII s = new FourSumII();

        int[] nums1 = {-1, 1};
        int[] nums2 = {-1, 1};
        int[] nums3 = {-1, 1};
        int[] nums4 = {-1, 1};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(6, res);
    }

    @Test
    public void testEmptyArrayReturnsZero() {
        FourSumII s = new FourSumII();

        int[] nums1 = {};
        int[] nums2 = {1};
        int[] nums3 = {-1};
        int[] nums4 = {0};

        int res = s.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(0, res);
    }
}