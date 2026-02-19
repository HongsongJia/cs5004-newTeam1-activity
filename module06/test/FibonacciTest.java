import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Bolin Zeng
 * Date: 2/18, 2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 06
 *
 * Test class for Fibonacci
 */
public class FibonacciTest {

    @Test
    public void testFibonacci2() {
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void testFibonacci3() {
        assertEquals(2, Fibonacci.fibonacci(3));
    }

    @Test
    public void testFibonacci5() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    public void testFibonacci20() {
        assertEquals(6765, Fibonacci.fibonacci(20));
    }


    @Test
    public void testFibonacciRecurrenceRelation() {
        for (int n = 2; n <= 10; n++) {
            assertEquals(
                    Fibonacci.fibonacci(n - 1) + Fibonacci.fibonacci(n - 2),
                    Fibonacci.fibonacci(n),
                    "Recurrence relation failed at n = " + n
            );
        }
    }
}