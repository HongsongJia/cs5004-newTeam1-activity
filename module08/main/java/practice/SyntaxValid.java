package java.practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/**
 * Description: In this problem, you are given a pattern. You have to check whether
 * the syntax of the given pattern is valid using the Pattern.compile method.
 *
 * Input Format:
 * The first line of input contains an integer N, denoting the number of test cases.
 * The next N lines contain a string of any printable characters representing the pattern of a regex.
 *
 * Output Format:
 * For each test case, print Valid if the syntax of the given pattern is correct.
 * Otherwise, print Invalid.
 *
 * @author Yikang Liu(Richard)
 * @source HackerRank (https://www.hackerrank.com/challenges/pattern-syntax-checker/problem)
 * @version CS5004 Object-oriented programming
 */
public class SyntaxValid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        // Loop 'num' times
        for (int i = 0; i < num; i++) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}