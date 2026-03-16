import org.junit.jupiter.api.Test;

import java.practice.StrDist;

import static org.junit.jupiter.api.Assertions.*;

public class StrDistTest {

    @Test
    public void testBasicCat() {
        assertEquals(9, StrDist.strDist("catcowcat", "cat"));
    }

    @Test
    public void testBasicCow() {
        assertEquals(3, StrDist.strDist("catcowcat", "cow"));
    }

    @Test
    public void testSubInMiddle() {
        assertEquals(9, StrDist.strDist("cccatcowcatxx", "cat"));
    }

    @Test
    public void testSubNotFound() {
        assertEquals(0, StrDist.strDist("abcdef", "xyz"));
    }
}