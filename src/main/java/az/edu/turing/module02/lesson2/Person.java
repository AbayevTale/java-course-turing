package az.edu.turing.module02.lesson2;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private static int count = 0;

    public Person() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Person");
    }

    @Override
    public String toString() {
        return "Person{name='%s', age=%d}".formatted(name, age);
    }

    public String getMaskedName() {
        return name.charAt(0) +
                name.substring(1).replaceAll(".", "*");
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) {
            return false;
        }
        return getAge() == person.getAge()
                && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + getAge();
        return result;
    }
}
