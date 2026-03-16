package java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

/**
 * Description: A test for Iterator solution question
 *
 * @author Yikang Liu(Richard)
 * @source HackerRank (https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true)
 * @version  CS5004 Object-oriented programming
 */

public class IteratorTest {

    @Test
    public void testFuncSkipsUntilDelimiter() {
        ArrayList mylist = new ArrayList();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        Iterator it = Solution.func(mylist);

        assertEquals("Hello", it.next());
        assertEquals("Java", it.next());
        assertFalse(it.hasNext());
    }
}