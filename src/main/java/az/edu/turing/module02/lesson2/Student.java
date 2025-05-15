package az.edu.turing.module02.lesson2;

public class Student extends Person {

    private double grade;

    public Student() {
        super();
        System.out.println("Student constructor");
    }
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getMaskedName() {
        return getName().charAt(0) + getName().substring(2).replaceAll(".", "*");
    }
}
