import org.junit.jupiter.api.Test;

import java.practice.Solution;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Description：A test for solution question
 *
 * @author Yikang Liu(Richard)
 * @source HackerRank {@link//www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true}
 * @version  CS5004 Object-oriented programming
 */
class SolutionTest {

    @Test
    void testStudentSort() {
        List<Solution.Student> list = new ArrayList<>();
        list.add(new Solution.Student(33, "Rumpa", 3.68));
        list.add(new Solution.Student(85, "Ashis", 3.85));
        list.add(new Solution.Student(56, "Samiha", 3.75));
        list.add(new Solution.Student(19, "Samara", 3.75));
        list.add(new Solution.Student(22, "Fahim", 3.76));

        list.sort((s1, s2) -> {
            // Sort by CGPA in descending order
            if (s1.getCgpa() != s2.getCgpa()) {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
            // Sort by Name in alphabetical order
            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }
            // Sort by ID in ascending order
            return Integer.compare(s1.getId(), s2.getId());
        });

        assertEquals("Ashis", list.get(0).getName());
        assertEquals("Fahim", list.get(1).getName());
        assertEquals("Samara", list.get(2).getName());
        assertEquals("Samiha", list.get(3).getName());
        assertEquals("Rumpa", list.get(4).getName());
    }
}