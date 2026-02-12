import java.util.Objects;

/** feel free to use this template as a starting point. */

public class Student extends Person {
    private int id;

    public Student(String theName, int id) {
        super(theName);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + this.getName() + '\'' + ", id=" + this.getId() + '}';
    }


    @Override
    public boolean equals(Object obj) {
        // 1. Check if comparing with itself
        if (this == obj) {
            return true;
        }
        
        // 2. Check if obj is null
        if (obj == null) {
            return false;
        }
        
        // 3. Check if obj is the same class (using getClass() to ensure exact type match)
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Cast and compare fields
        Student other = (Student) obj;
        return this.id == other.id && 
               Objects.equals(this.getName(), other.getName());
    }

    @Override
    public int hashCode() {
        // Use Objects.hash() to combine multiple fields
        return Objects.hash(this.getName(), this.id);
    }

    public static void main(String[] args) {
        int value = 10;
        Person e1 = new Student("Alice", 1);
        Person e2 = new Student("Bob", 2);
        Person e3 = new Student("Carol", 3);
        Person e5 = new Person("Alice");
        Person arrayOfPeople[] = {e1, e2, e3};

        Person e4 = new Student("Alice", 1); // same as e1?

        //operator
        System.out.println(e1 == arrayOfPeople[0]); // true (same reference)
        System.out.println(e1 == e4); // false (different objects)

        //equals() method
        System.out.println(e1.equals(e4)); // true (same name and id)
        System.out.println(e1.equals(e5)); // false (e5 is Person, e1 is Student)

        //hashCode()
        System.out.println(e1.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e1.hashCode() == e4.hashCode()); // true

    }
}
