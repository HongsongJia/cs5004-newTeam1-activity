import org.junit.Test;
import static org.junit.Assert.*;

public class HongkunTest {

    @Test
    public void testMakeAbbaExample1() {
        Hongkun hk = new Hongkun();
        assertEquals("HiByeByeHi", hk.makeAbba("Hi", "Bye"));
    }

    @Test
    public void testMakeAbbaExample2() {
        Hongkun hk = new Hongkun();
        assertEquals("YoAliceAliceYo", hk.makeAbba("Yo", "Alice"));
    }

    @Test
    public void testMakeAbbaExample3() {
        Hongkun hk = new Hongkun();
        assertEquals("WhatUpUpWhat", hk.makeAbba("What", "Up"));
    }

    @Test
    public void testEmptyStrings() {
        Hongkun hk = new Hongkun();
        assertEquals("", hk.makeAbba("", ""));
    }

    @Test
    public void testOneEmptyString() {
        Hongkun hk = new Hongkun();
        assertEquals("HiHi", hk.makeAbba("Hi", ""));
        assertEquals("ByeBye", hk.makeAbba("", "Bye"));
    }

    @Test
    public void testSingleCharacters() {
        Hongkun hk = new Hongkun();
        assertEquals("xyyx", hk.makeAbba("x", "y"));
    }
}
