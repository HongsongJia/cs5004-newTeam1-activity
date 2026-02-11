import java.util.HashSet;
import java.util.Set;

// Practice using sets in Java

public class SetPractice {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Carol");

        System.out.println("Initial set: " + set);
        // how it behaves with both students and person.
        // What will happen when we add "Alice" again?
        boolean added = set.add("Alice");
        System.out.println(added); // false
        System.out.println(set); // {Bob, Alice, Carol}

        // Create a set of Person objects
        Set<Person> people = new HashSet<>();
        
        Person p1 = new Person("Alice");
        Person p2 = new Student("Alice", 1);
        Person p3 = new Student("Alice", 2);
        Person p4 = new Student("Alice", 1); // same as p2? (same name and id)
        Person p5 = new Person("Bob");
        Person p6 = new Person("Alice"); // same as p1? (same name)
        
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p5);

        // Set after adding p1, p2, p3, p5
        for (Person p : people) {
            System.out.println("  " + p);
        }

        // duplicate Person
        boolean addedP6 = people.add(p6);
        System.out.println(addedP6);
        // false
        for (Person p : people) {
            System.out.println("  " + p);
        }

        // duplicate Student
        boolean addedP4 = people.add(p4);
        // false
        for (Person p : people) {
            System.out.println("  " + p);
        }

    }
}
