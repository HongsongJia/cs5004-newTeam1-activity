package practice;

import java.util.ArrayList;

/**
 * @author Yanshi Liu
 * @version Object-oriented programming
 * @since: 3/4/2026
 * Course: CS 5004
 * Team: Team 1
 * Module: 09
 *
 * Practice Problem: CodeHS - ArrayLists - LEVEL 3 - mode
 *
 * Problem Description:
 * Given an ArrayList of integers, return the mode of the list.
 * The mode is the value that occurs most often.
 * If two values occur equally frequently, return the first value.
 *
 * Examples:
 * mode({2, 2, 3, 3, 3}) --> 3
 * mode({4, 7, 5, 5, 6, 4}) --> 4
 *
 * Source: CodeHS
 */
public class Mode {
    /**
     * Returns the mode of the given ArrayList of integers.
     * If two values occur equally frequently, returns the first one encountered.
     * @param list the input ArrayList of integers
     * @return the mode of the list
     */
    public static int mode(ArrayList<Integer> list) {
        int modeVal = list.get(0);
        int modeCount = 1;

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            if (count > modeCount) {
                modeCount = count;
                modeVal = list.get(i);
            }
        }
        return modeVal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2); list1.add(2); list1.add(3); list1.add(3); list1.add(3);
        System.out.println(mode(list1)); // 3

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(7); list2.add(5); list2.add(5); list2.add(6); list2.add(4);
        System.out.println(mode(list2)); // 4

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); list3.add(2); list3.add(3);
        System.out.println(mode(list3)); // 1 (all equal, return first)

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(5);
        System.out.println(mode(list4)); // 5 (single element)

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(-1); list5.add(-1); list5.add(2);
        System.out.println(mode(list5)); // -1 (negative number as mode)
    }
}

//javac practice/Mode.java
//java practice.Mode
