/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 10, 2026
 *
 * Test class for centeredAverage method.
 */

public class YunmengzeFangTest {

    public static void main(String[] args) {

        YunmengzeFang y = new YunmengzeFang();

        // Test Case 1
        int[] test1 = {1, 2, 3, 4, 100};
        int result1 = y.centeredAverage(test1);
        System.out.println("Test 1 Input: [1, 2, 3, 4, 100]");
        System.out.println("Expected: 3");
        System.out.println("Actual: " + result1);
        System.out.println();

        // Test Case 2
        int[] test2 = {1, 1, 5, 5, 10, 8, 7};
        int result2 = y.centeredAverage(test2);
        System.out.println("Test 2 Input: [1, 1, 5, 5, 10, 8, 7]");
        System.out.println("Expected: 5");
        System.out.println("Actual: " + result2);
        System.out.println();

        // Test Case 3
        int[] test3 = {-10, -4, -2, -4, -2, 0};
        int result3 = y.centeredAverage(test3);
        System.out.println("Test 3 Input: [-10, -4, -2, -4, -2, 0]");
        System.out.println("Expected: -3");
        System.out.println("Actual: " + result3);
    }
}
