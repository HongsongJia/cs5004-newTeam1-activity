import org.junit.Test;
import static org.junit.Assert.*;

public class SpiralMatrixTest {

    private void assertMatrixEquals(int[][] expected, int[][] actual) {
        assertNotNull("Matrix should not be null", actual);
        assertEquals("Row count mismatch", expected.length, actual.length);

        for (int r = 0; r < expected.length; r++) {
            assertArrayEquals("Mismatch at row " + r, expected[r], actual[r]);
        }
    }

    @Test
    public void testN1() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] result = sm.generateMatrix(1);

        int[][] expected = {
                {1}
        };

        assertMatrixEquals(expected, result);
    }

    @Test
    public void testN2() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] result = sm.generateMatrix(2);

        int[][] expected = {
                {1, 2},
                {4, 3}
        };

        assertMatrixEquals(expected, result);
    }

    @Test
    public void testN3() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] result = sm.generateMatrix(3);

        int[][] expected = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        assertMatrixEquals(expected, result);
    }

    @Test
    public void testN4() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] result = sm.generateMatrix(4);

        int[][] expected = {
                { 1,  2,  3,  4},
                {12, 13, 14,  5},
                {11, 16, 15,  6},
                {10,  9,  8,  7}
        };

        assertMatrixEquals(expected, result);
    }
}