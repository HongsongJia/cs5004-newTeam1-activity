import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("Apple", 3.5);
        map.put("Banana", 2.0);
        map.put("Cherry", 4.0);

        // let's print the map
        System.out.println(map);

        // what happens if we add a duplicate key?
        Double oldValue = map.put("Apple", 6.0);
        System.out.println(oldValue);
        System.out.println(map);
        System.out.println(map.get("Apple"));
        //Duplicate keys update the value



        
        // Now try it with Person/Student. We will
        // use the person or student as a key and the
        // value will be a set of classes they are taking

        Map<Person, Set<String>> classes = new HashMap<>();

        // Create some Person and Student objects
        Person p1 = new Person("Alice");
        Person p2 = new Student("Bob", 1);
        Person p3 = new Student("Carol", 2);
        Person p4 = new Student("Bob", 1); // duplicate of p2
        
        // You will find Set.of() useful here
        // for example:
        classes.put(p1, Set.of("CS5001", "CS5002"));
        classes.put(p2, Set.of("CS5001", "CS5008"));
        classes.put(p3, Set.of("CS5002", "CS5004", "CS5008"));

        for (Map.Entry<Person, Set<String>> entry : classes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
