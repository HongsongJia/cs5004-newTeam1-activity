/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 3/18/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 09
 *
 * Practice Problem: CodeHS - ArrayLists - LEVEL 3 - mode
 *
 * Test Description:
 *
 * JUnit tests for the Mode class.
 * Tests verify that mode() correctly returns the most frequent value in the list.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import practice.Mode;

public class ModeTest {

    @Test
    void testMode() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2); list1.add(2); list1.add(3); list1.add(3); list1.add(3);
        assertEquals(3, Mode.mode(list1)); // 3 appears most

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(7); list2.add(5); list2.add(5); list2.add(6); list2.add(4);
        assertEquals(4, Mode.mode(list2)); // 4 and 5 tie, return first (4)

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); list3.add(2); list3.add(3);
        assertEquals(1, Mode.mode(list3)); // all equal, return first

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(5);
        assertEquals(5, Mode.mode(list4)); // single element

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(-1); list5.add(-1); list5.add(2);
        assertEquals(-1, Mode.mode(list5)); // negative number as mode
    }
}