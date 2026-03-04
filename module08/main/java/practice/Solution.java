package java.practice;

import java.util.*;
/**
 * Description：The first line of input contains an integer N , representing the total number of students.
 * The next lines contains a list of student information in the following structure: ID Name CGPA
 *
 * Constraints：
 * 2 <= N <= 1000
 * 0 <= ID <= 100000
 * 5 <= |Name| <= 30
 * 0 <= CGPA <= 4.00
 *
 * The name contains only lowercase English letters. The ID contains only integer numbers without leading zeros.
 * The CGPA will contain, at most, 2 digits after the decimal point.
 *
 * Output Format:
 * After rearranging the students according to the above rules, print the first name of each
 * student on a separate line.
 *
 * @author Yikang Liu(Richard)
 * @source HackerRank {@link//www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true}
 * @version  CS5004 Object-oriented programming
 */

public class Solution {
    static class Student {
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getCgpa() { return cgpa; }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }

        Collections.sort(studentList, (s1, s2) -> {
            if (s1.getCgpa() != s2.getCgpa()) {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }
            return Integer.compare(s1.getId(), s2.getId());
        });

        for(Student st: studentList) {
            System.out.println(st.getName());
        }
    }
}
