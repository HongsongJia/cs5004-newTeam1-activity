/**
 * Utility class that generates an n x n spiral matrix.
 *
 * <p>The matrix is filled with integers from 1 to n² in spiral order,
 * starting from the top-left corner and moving clockwise.
 *
 * <p>Example for n = 3:
 * <pre>
 * 1  2  3
 * 8  9  4
 * 7  6  5
 * </pre>
 *
 * <p>Algorithm:
 * The matrix is filled layer by layer (round by round). In each round,
 * four edges are populated:
 * <ol>
 *     <li>Left to right (top row)</li>
 *     <li>Top to bottom (right column)</li>
 *     <li>Right to left (bottom row)</li>
 *     <li>Bottom to top (left column)</li>
 * </ol>
 * Boundaries shrink inward after each round.
 *
 * <p>Time Complexity: O(n²)
 * <br>Space Complexity: O(n²)
 *
 * @author HongsongJia
 */
class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int startX = 0, startY = 0;
        int offset = 1;
        int round = 0;
        int count = 1;

        while (round < n / 2) {

            int i = startX;
            int j = startY;


            for (j = startY; j < n - offset; j++) {
                ans[startX][j] = count++;
            }

            for (i = startX; i < n - offset; i++) {
                ans[i][j] = count++;
            }

            for (; j > startY; j--) {
                ans[i][j] = count++;
            }

            for (; i > startX; i--) {
                ans[i][j] = count++;
            }

            startX++;
            startY++;
            offset++;
            round++;
        }

        if (n % 2 == 1) {
            ans[n / 2][n / 2] = n * n;
        }
        return ans;
    }
}
