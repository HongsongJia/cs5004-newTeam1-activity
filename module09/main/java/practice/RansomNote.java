package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: Given two strings, ransomNote and magazine, determine whether
 * ransomNote can be constructed by using the letters from magazine.
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Input Format:
 * The input consists of two strings:
 * The first string represents ransomNote.
 * The second string represents magazine.
 *
 * Output Format:
 * Return true if ransomNote can be constructed from magazine;
 * otherwise, return false.
 *
 * Example:
 * Input:
 * ransomNote = "aa"
 * magazine = "aab"
 *
 * Output:
 * true
 *
 * @author Hongsong Jia
 * @source LeetCode 383 - Ransom Note
 * @version CS5004 Object-Oriented Programming
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> records = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            records .put(c, 1 + records.getOrDefault(c, 0));
        }
        for (char c : ransomNote.toCharArray()) {
            records.put(c, records.getOrDefault(c, 0) - 1);
            if (records.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}