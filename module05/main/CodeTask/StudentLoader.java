import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// yes we used all the above in the solution. You
// may not use them all, that is fine.


/**
 * a few java syntax items to help you out. Depending on how you do it, you may not need them
 *
 * /
 *
 * /* String[] parts = line.split("\\s+"); // split by whitespace String student = parts[0]; String
 * course = parts[1];
 */

/**
 * Set.of() creates an immutable set!, So if you want it mutable.
 *
 * You will need to use a HashSet
 *
 * Set<String> courses = new HashSet<>();
 *
 * courses.add(course);
 *
 * students.put(student, courses);
 */

/*
 * Using a stream to take a list and make it a string of "value value value"
 *
 *
 * students.get(student).stream().collect(Collectors.joining(" ")) - This one may be easier to do as
 * a separate loop, but feel free to play with this one.
 *
 */

public class StudentLoader {

    public static void main(String[] args) {
        // Create a HashMap to store student names and their courses
        Map<String, Set<String>> students = new HashMap<>();

        try {
            // Read all lines from courses.txt
            var lines = Files.readAllLines(Paths.get("courses.txt"));

            // Process each line
            for (String line : lines) {
                // Split by whitespace
                String[] parts = line.split("\\s+");

                if (parts.length >= 2) {
                    String studentName = parts[0];
                    String courseCode = parts[1];

                    // If student doesn't exist in map, create a new HashSet
                    if (!students.containsKey(studentName)) {
                        students.put(studentName, new HashSet<>());
                    }

                    // Add the course to the student's set
                    students.get(studentName).add(courseCode);
                }
            }

            // Print results
            for (String studentName : students.keySet()) {
                // Convert set to space-separated string
                String courseList = students.get(studentName).stream()
                        .collect(Collectors.joining(" "));

                System.out.println(studentName + " has completed " + courseList);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: courses.txt");
            e.printStackTrace();
        }
    }
}