import java.util.Map;
import java.util.HashMap;

/**
 * @author Hongkun Yi
 * Date: 2/11, 2026
 * Course: CS 5004
 * Team: Team 2
 * Module: 05
 *
 * Practice Problem: CodingBat - MapShare
 *
 * Problem Description:
 * Modify and return the given map as follows: if the key "a" has a value,
 * set the key "b" to have that same value. In all cases remove the key "c",
 * leaving the rest of the map unchanged.
 *
 * Examples:
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 *
 * Source: CodingBat
 */
public class Hongkun {

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "bbb");
        test1.put("c", "ccc");
        System.out.println(mapShare(test1)); // {a=aaa, b=aaa}

        Map<String, String> test2 = new HashMap<>();
        test2.put("b", "xyz");
        test2.put("c", "ccc");
        System.out.println(mapShare(test2)); // {b=xyz}

        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aaa");
        test3.put("c", "meh");
        test3.put("d", "hi");
        System.out.println(mapShare(test3)); // {a=aaa, b=aaa, d=hi}
    }
}