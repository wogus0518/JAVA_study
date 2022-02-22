package JAVA_Example.Ch_11;

import java.util.HashSet;
import java.util.Objects;

class Person{
    String name;
    int age;

    Person(){};
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Person("Eric", 20));
        set.add(new Person("Eric", 20));
        System.out.println(set.toString());
    }
}
