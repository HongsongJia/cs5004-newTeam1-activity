/**
 * CodeHS : isSquare
 * Question description：A method that returns true if a 2D array is a square.
 * A 2D array is considered a square if the number of rows is equal to the length of each row.
 * We can assume that each row in the 2D array has the same number of indices.
 * @author Yikang Liu(Richard)
 * @version  (Object-oriented programming)
 */
public class IsSquare {
    public static boolean isSquare(int[][] a) {
        return a != null && a.length > 0 && a.length == a[0].length;
    }
}