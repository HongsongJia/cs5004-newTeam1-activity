import org.junit.Test;
import static org.junit.Assert.*;

public class HongsongTest {

    @Test
    public void testHappyNumberExample() {
        Hongsong hs = new Hongsong();
        assertTrue(hs.isHappy(19));
    }

    @Test
    public void testSingleDigitHappy() {
        Hongsong hs = new Hongsong();
        assertTrue(hs.isHappy(1));
        assertTrue(hs.isHappy(7));
    }

    @Test
    public void testUnhappyNumber() {
        Hongsong hs = new Hongsong();
        assertFalse(hs.isHappy(2));
        assertFalse(hs.isHappy(4));
        assertFalse(hs.isHappy(20));
    }

    @Test
    public void testLargeNumber() {
        Hongsong hs = new Hongsong();
        assertTrue(hs.isHappy(100));
    }
}
