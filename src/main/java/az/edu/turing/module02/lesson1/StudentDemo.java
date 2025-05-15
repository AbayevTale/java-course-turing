package az.edu.turing.module02.lesson1;

public class StudentDemo {

    public static void main(String[] args) {

        Student.studentCount++;
        Student.printCount();

        Student s1 = new Student();
        s1.setName("Tale");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.printName();

        Student s2 = new Student();
        s2.setName("Rasul");
        s2.printName();
        s2 = s1;
        s2.printName();
        System.gc();
        Runtime.getRuntime().gc();



    }


}
