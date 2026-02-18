/**
 * Test file for ArrayFirst.firstElement()
 * @author Yanshi Liu
 * Date: 2/18/2026
 * Course: CS 5004
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayFirstTest {

    @Test
    public void testFirstElementNormal() {
        assertEquals("hello", ArrayFirst.firstElement(new String[]{"hello", "world"}));
    }

    @Test
    public void testFirstElementEmptyArray() {
        assertEquals("", ArrayFirst.firstElement(new String[0]));
    }

    @Test
    public void testFirstElementNullArray() {
        assertEquals("", ArrayFirst.firstElement(null));
    }

    @Test
    public void testFirstElementFirstIsNull() {
        assertEquals("", ArrayFirst.firstElement(new String[]{null, "world"}));
    }
}
//javac -cp ".:../lib/junit-4.13.1.jar:../lib/hamcrest-core-1.3.jar:../main" ../main/ArrayFirst.java ArrayFirstTest.java
//java -cp ".:../lib/junit-4.13.1.jar:../lib/hamcrest-core-1.3.jar:../main" org.junit.runner.JUnitCore ArrayFirstTest

//bash run-tests.sh
