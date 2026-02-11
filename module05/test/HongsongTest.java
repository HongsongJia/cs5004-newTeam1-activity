import org.junit.Test;
import static org.junit.Assert.*;

public class HongsongTest {

    @Test
    public void testExample1() {
        Hongsong hs = new Hongsong();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = hs.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testExample2() {
        Hongsong hs = new Hongsong();

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = hs.twoSum(nums, target);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testExample3() {
        Hongsong hs = new Hongsong();

        int[] nums = {3, 3};
        int target = 6;

        int[] result = hs.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testNoSolution() {
        Hongsong hs = new Hongsong();

        int[] nums = {1, 2, 3};
        int target = 10;

        int[] result = hs.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }
}
