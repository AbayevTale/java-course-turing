package az.edu.turing.module03.lesson4;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public final boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2 * age;

    }
}
