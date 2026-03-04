/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 3/4/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 08
 *
 * Practice Problem: CodingBat - AP-2 - notAlone
 *
 * Test Description:
 *
 * JUnit tests for the java.NotAlone class.
 * Tests verify that notAlone() correctly replaces alone values with the larger neighbor.
 */

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;

import practice.NotAlone;

public class NotAloneTest {

    @Test
    void testNotAlone(){
        assertArrayEquals(new int[]{1, 3, 3}, NotAlone.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, NotAlone.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, NotAlone.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{1, 2, 2}, NotAlone.notAlone(new int[]{1, 2, 2}, 2));
        assertArrayEquals(new int[]{2}, NotAlone.notAlone(new int[]{2}, 2));
        assertArrayEquals(new int[]{1, 1, 1, 2}, NotAlone.notAlone(new int[]{1, 2, 1, 2}, 2));

    }
}

//cp /Users/ysliu/Documents/CS5004/cs5004-newTeam1-activity/module07/lib/junit-platform-console-standalone-1.14.0.jar /Users/ysliu/Documents/CS5004/cs5004-newTeam1-activity/module08/lib/
//java -cp lib/*:main/java:out org.junit.platform.console.ConsoleLauncher --select-class=NotAloneTest