package az.edu.turing.module02.lesson1;

public class Student {

    public static int studentCount;
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    public Student() {
    }

    public void printName() {
        System.out.println(name);
    }

    public static void printCount() {
        System.out.println(studentCount);
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
