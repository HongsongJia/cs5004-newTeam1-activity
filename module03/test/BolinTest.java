import org.junit.Test;
import static org.junit.Assert.*;

public class BolinTest {

    @Test
    public void testBasicTrue() {
        Bolin solver = new Bolin();
        int[] nums = {2, 4, 8};
        assertTrue(solver.bolin(0, nums, 10));
    }

    @Test
    public void testBasicFalse() {
        // no anwser
        Bolin solver = new Bolin();
        int[] nums = {2, 4, 8};
        assertFalse(solver.bolin(0, nums, 15));
    }

    @Test
    public void testSingleElement() {
        // single
        Bolin solver = new Bolin();
        int[] nums = {5};
        assertTrue(solver.bolin(0, nums, 5));
        assertFalse(solver.bolin(0, nums, 3));
    }

    @Test
    public void testEmptyArray() {
        Bolin solver = new Bolin();
        int[] nums = {};
        assertTrue(solver.bolin(0, nums, 0));
        assertFalse(solver.bolin(0, nums, 5));
    }

    @Test
    public void testDuplicateNumbers() {
        // test repeat number
        Bolin solver = new Bolin();
        int[] nums = {3, 3, 3};
        assertTrue(solver.bolin(0, nums, 6));  // 3+3
        assertTrue(solver.bolin(0, nums, 9));  // 3+3+3
        assertFalse(solver.bolin(0, nums, 7));
    }


    @Test
    public void testNegativeTarget() {
        // test nagtive
        Bolin solver = new Bolin();
        int[] nums = {2, 4, 8};
        assertFalse(solver.bolin(0, nums, -5));
    }
}