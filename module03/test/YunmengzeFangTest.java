/**
 * Test class for YunmengzeFang makeEnds method.
 * Demonstrates simple unit-style testing using main.
 */

public class YunmengzeFangTest {

    public static void main(String[] args) {

        YunmengzeFang z = new YunmengzeFang();

        // Test case 1
        int[] test1 = {1, 2, 3};
        int[] result1 = z.makeEnds(test1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2
        int[] test2 = {7, 4, 6, 2};
        int[] result2 = z.makeEnds(test2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]");

        // Test case 3
        int[] test3 = {5};
        int[] result3 = z.makeEnds(test3);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}
