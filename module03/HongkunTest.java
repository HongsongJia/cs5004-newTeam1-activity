package module03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HongkunTest {

    @Test
    void testFront11_Basic() {
        Hongkun solver = new Hongkun();
        int[] inputA = {1, 2, 3};
        int[] inputB = {7, 9, 8};
        int[] expected = {1, 7};
        
        int[] actual = solver.front11(inputA, inputB);
        
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFront11_EmptyA() {
        Hongkun solver = new Hongkun();
        int[] inputA = {};
        int[] inputB = {2, 8};
        int[] expected = {2};

        int[] actual = solver.front11(inputA, inputB);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testFront11_EmptyB() {
        Hongkun solver = new Hongkun();
        int[] inputA = {1, 7};
        int[] inputB = {};
        int[] expected = {1};

        int[] actual = solver.front11(inputA, inputB);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testFront11_BothEmpty() {
        Hongkun solver = new Hongkun();
        int[] inputA = {};
        int[] inputB = {};
        int[] expected = {};

        int[] actual = solver.front11(inputA, inputB);

        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testFront11_SingleElements() {
        Hongkun solver = new Hongkun();
        int[] inputA = {1};
        int[] inputB = {2};
        int[] expected = {1, 2};
        
        int[] actual = solver.front11(inputA, inputB);
        
        assertArrayEquals(expected, actual);
    }
}
