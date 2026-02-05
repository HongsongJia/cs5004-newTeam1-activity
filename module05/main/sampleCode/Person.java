package sampleCode;
import java.util.Objects;

class Person {
    private String name;
    public Person(String theName) {
        this.name = theName;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Person p = (Person)o;
        return Objects.equals(this.name, p.name);
    }
}
