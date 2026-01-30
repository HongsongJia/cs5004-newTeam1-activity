package module03;

import org.junit.Test;
import static org.junit.Assert.*;

public class HongkunTest {

    @Test
    public void testFront11_Basic() {
        Hongkun solver = new Hongkun();
        int[] inputA = {1, 2, 3};
        int[] inputB = {7, 9, 8};
        int[] expected = {1, 7};
        
        int[] actual = solver.front11(inputA, inputB);
        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFront11_EmptyA() {
        Hongkun solver = new Hongkun();
        int[] inputA = {};
        int[] inputB = {2, 8};
        int[] expected = {2};

        int[] actual = solver.front11(inputA, inputB);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFront11_EmptyB() {
        Hongkun solver = new Hongkun();
        int[] inputA = {1, 7};
        int[] inputB = {};
        int[] expected = {1};

        int[] actual = solver.front11(inputA, inputB);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFront11_BothEmpty() {
