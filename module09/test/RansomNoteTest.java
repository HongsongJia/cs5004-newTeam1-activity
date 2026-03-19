import org.junit.Test;

import practice.RansomNote;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RansomNoteTest {

    @Test
    public void testExample1() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("aa", "aab"));
    }

    @Test
    public void testCannotConstructBecauseMissingLetter() {
        RansomNote s = new RansomNote();
        assertFalse(s.canConstruct("aa", "ab"));
    }

    @Test
    public void testSingleCharacterTrue() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("a", "a"));
    }

    @Test
    public void testSingleCharacterFalse() {
        RansomNote s = new RansomNote();
        assertFalse(s.canConstruct("a", "b"));
    }

    @Test
    public void testEmptyRansomNote() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("", "abc"));
    }

    @Test
    public void testEmptyMagazine() {
        RansomNote s = new RansomNote();
        assertFalse(s.canConstruct("a", ""));
    }

    @Test
    public void testBothEmpty() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("", ""));
    }

    @Test
    public void testRepeatedLettersEnoughSupply() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("bbb", "abbbcc"));
    }

    @Test
    public void testRepeatedLettersNotEnoughSupply() {
        RansomNote s = new RansomNote();
        assertFalse(s.canConstruct("bbbb", "abbbcc"));
    }

    @Test
    public void testOrderDoesNotMatter() {
        RansomNote s = new RansomNote();
        assertTrue(s.canConstruct("abc", "cba"));
    }
}