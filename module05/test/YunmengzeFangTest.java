/**
 * Test class for YunmengzeFang countCode method.
 * Demonstrates simple unit-style testing using main.
 */

public class YunmengzeFangTest {

    public static void main(String[] args) {

        YunmengzeFang z = new YunmengzeFang();

        // Test case 1
        String test1 = "aaacodebbb";
        int result1 = z.countCode(test1);
        System.out.println("Test 1: " + result1);

        // Test case 2
        String test2 = "codexxcode";
        int result2 = z.countCode(test2);
        System.out.println("Test 2: " + result2);

        // Test case 3
        String test3 = "cozexxcope";
        int result3 = z.countCode(test3);
        System.out.println("Test 3: " + result3);
    }
}
