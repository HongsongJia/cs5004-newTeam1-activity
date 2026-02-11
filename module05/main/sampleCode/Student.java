package sampleCode;
import java.util.Objects;

public class Student extends Person {

    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), id);
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', id=" + id + "}";
    }
}