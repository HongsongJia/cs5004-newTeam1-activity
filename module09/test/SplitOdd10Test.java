import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Bolin Zeng
 * @version (Object-oriented programming)
 *
 * Date: 3/17, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 09
 *
 * Test class for SplitOdd10.
 */
public class SplitOdd10Test {


    @Test
    public void testCodingBatExample1() {
        assertTrue(SplitOdd10.splitOdd10(new int[]{5, 5, 5}));
    }

    @Test
    public void testCodingBatExample2() {
        assertFalse(SplitOdd10.splitOdd10(new int[]{5, 5, 6}));
    }

    @Test
    public void testCodingBatExample3() {
        assertTrue(SplitOdd10.splitOdd10(new int[]{5, 5, 6, 1}));
    }


    @Test
    public void testEmptyArray() {
        // sumA=0 (0%10==0 ✓), sumB=0 (0%2==0 ✗) → false
        assertFalse(SplitOdd10.splitOdd10(new int[]{}));
    }

    @Test
    public void testSingleOddElement() {
        // A=0(✓), B=1(✓) → true
        assertTrue(SplitOdd10.splitOdd10(new int[]{1}));
    }

    @Test
    public void testSingleEvenElement() {
        // A=2(✗), B=0(✗) → false
        assertFalse(SplitOdd10.splitOdd10(new int[]{2}));
    }

    @Test
    public void testSingleTen() {
        // A=10(✓), B=0(✗) → false
        assertFalse(SplitOdd10.splitOdd10(new int[]{10}));
    }



    @Test
    public void testMultipleOfTenAndOdd() {
        // A={10}, B={3} → true
        assertTrue(SplitOdd10.splitOdd10(new int[]{10, 3}));
    }

    @Test
    public void testAllEvenNoValidSplit() {
        // 所有元素都是偶数，B的和永远是偶数 → false
        assertFalse(SplitOdd10.splitOdd10(new int[]{2, 4, 6}));
    }

    @Test
    public void testLargerArray() {
        // A={5,5}, B={3} → sumA=10(✓), sumB=3(✓) → true
        assertTrue(SplitOdd10.splitOdd10(new int[]{5, 5, 3}));
    }

    @Test
    public void testNegativeNumbers() {
        // A={-10}, B={3} → sumA=-10(-10%10==0 ✓), sumB=3(✓) → true
        assertTrue(SplitOdd10.splitOdd10(new int[]{-10, 3}));
    }

    @Test
    public void testAllZeros() {
        // sumA=0(✓), sumB=0(偶数✗) → false
        assertFalse(SplitOdd10.splitOdd10(new int[]{0, 0, 0}));
    }
}