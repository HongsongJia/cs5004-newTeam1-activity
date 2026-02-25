/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 2/24/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 07
 *
 * Practice Problem: CodingBat - AP-1 - hasOne
 *
 * Test Description:
 *
 * JUnit tests for the HasOne class.
 * Tests verify that hasOne() correctly returns true if n contains a 1 digit,
 * and false otherwise.
 */

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;

public class HasOneTest{

    @Test
    void testHasOne(){
        assertTrue(HasOne.hasOne(10), "10 should return true");
        assertFalse(HasOne.hasOne(22), "22 should return false");
        assertFalse(HasOne.hasOne(220), "220 should return false");
        assertTrue(HasOne.hasOne(1), "1 should return true");
        assertTrue(HasOne.hasOne(100), "100 should return true");
        assertTrue(HasOne.hasOne(11), "11 should return true");
        assertFalse(HasOne.hasOne(0), "0 should return false");
        assertFalse(HasOne.hasOne(9999), "9999 should return false");
    }
}
//cd /Users/ysliu/Documents/CS5004/cs5004-newTeam1-activity/module07
//javac -cp "lib/*:main" -d test test/HasOneTest.java
//java -jar lib/junit-platform-console-standalone-1.14.0.jar --class-path "main:test" --select-class HasOneTest