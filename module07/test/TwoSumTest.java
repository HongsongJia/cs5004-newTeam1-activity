import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {

    private void assertValidTwoSum(int[] nums, int target, int[] res) {
        assertNotNull("result should not be null", res);
        assertEquals("result length must be 2", 2, res.length);

        int i = res[0];
        int j = res[1];

        assertTrue("res[0] out of bounds", i >= 0 && i < nums.length);
        assertTrue("res[1] out of bounds", j >= 0 && j < nums.length);
        assertNotEquals("indices must be different", i, j);

        assertEquals("nums[i] + nums[j] must equal target",
                target, nums[i] + nums[j]);
    }

    private void assertIndicesEqualIgnoreOrder(int[] expected, int[] actual) {
        assertNotNull(actual);
        assertEquals(2, actual.length);
        int a0 = actual[0], a1 = actual[1];
        assertTrue("indices mismatch (ignore order)",
                (a0 == expected[0] && a1 == expected[1]) ||
                        (a0 == expected[1] && a1 == expected[0]));
    }

    @Test
    public void testExample1() {
        TwoSum s = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = s.twoSum(nums, target);
        assertValidTwoSum(nums, target, res);
        assertIndicesEqualIgnoreOrder(new int[]{0, 1}, res);
    }

    @Test
    public void testExample2() {
        TwoSum s = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = s.twoSum(nums, target);
        assertValidTwoSum(nums, target, res);
        assertIndicesEqualIgnoreOrder(new int[]{1, 2}, res);
    }

    @Test
    public void testDuplicateValues() {
        TwoSum s = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;

        int[] res = s.twoSum(nums, target);
        assertValidTwoSum(nums, target, res);
        assertIndicesEqualIgnoreOrder(new int[]{0, 1}, res);
    }

    @Test
    public void testNegatives() {
        TwoSum s = new TwoSum();
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8; // -3 + -5

        int[] res = s.twoSum(nums, target);
        assertValidTwoSum(nums, target, res);
        assertIndicesEqualIgnoreOrder(new int[]{2, 4}, res);
    }

    @Test
    public void testZeros() {
        TwoSum s = new TwoSum();
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        int[] res = s.twoSum(nums, target);
        assertValidTwoSum(nums, target, res);
        assertIndicesEqualIgnoreOrder(new int[]{0, 3}, res);
    }

    @Test
    public void testNullOrEmptyReturnsDefault() {
        TwoSum s = new TwoSum();

        int[] res1 = s.twoSum(null, 10);
        assertNotNull(res1);
        assertEquals(2, res1.length);
        assertArrayEquals(new int[]{0, 0}, res1);

        int[] res2 = s.twoSum(new int[]{}, 10);
        assertNotNull(res2);
        assertEquals(2, res2.length);
        assertArrayEquals(new int[]{0, 0}, res2);
    }
}