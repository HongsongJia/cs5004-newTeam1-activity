import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * CodeHS : isSquare
 * Description：A test for class IsSquare
 * @author Yikang Liu(Richard)
 * @version  (Object-oriented programming)
 */
public class IsSquareTest {

    @Test
    void returnsTrueForSquareMatrices() {
        assertTrue(IsSquare.isSquare(new int[][] {{1}})); // 1x1
        assertTrue(IsSquare.isSquare(new int[][] {{1,2},{3,4}})); // 2x2
        assertTrue(IsSquare.isSquare(new int[][] {{1,2,3},{4,5,6},{7,8,9}})); // 3x3
    }

    @Test
    void returnsFalseForNonSquareMatrices() {
        assertFalse(IsSquare.isSquare(new int[][] {{1,2,3},{4,5,6}})); // 2x3
        assertFalse(IsSquare.isSquare(new int[][] {{1},{2}}));         // 2x1
        assertFalse(IsSquare.isSquare(new int[][] {{1,2},{3,4},{5,6}})); // 3x2
    }

    @Test
    void handlesNullAndEmpty() {
        assertFalse(IsSquare.isSquare(null));
        assertFalse(IsSquare.isSquare(new int[][] {})); // length == 0
    }
}