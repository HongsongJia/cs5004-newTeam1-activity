import java.util.Objects;

class Person {
    private String name;

    public Person(String theName) {
        this.name = theName;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + this.name + '\'' + '}';
    }

    /**
     * Override equals method to compare Persons based on name.
     * Two persons are equal if they have the same name.
     * 
     * @param obj the object to compare with
     * @return true if the persons are equal, false otherwise
     */
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
        
        // 3. Check if obj is the same class
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Cast and compare fields
        Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
