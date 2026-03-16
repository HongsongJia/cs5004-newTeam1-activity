package java.practice;

import java.io.*;
import java.util.*;

/**
 * Description: In this problem, you are given an ArrayList that contains one or more
 * integers, followed by a special string "###", and then one or more strings.
 * You must use an Iterator to traverse the collection and print only the elements
 * that appear after the special string "###".
 *
 * Input Format:
 * The first line contains two integers, n and m.
 * The next n inputs are integers added to the ArrayList.
 * After that, the special string "###" is inserted into the ArrayList.
 * The next m inputs are strings added after "###".
 *
 * Output Format:
 * Print each string that appears after the special string "###", one per line.
 *
 * @author Yikang Liu (Richard)
 * @source HackerRank (https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true)
 * @version CS5004 Object-Oriented Programming
 */

public class Solution {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###")) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList mylist = new ArrayList();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");

        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
