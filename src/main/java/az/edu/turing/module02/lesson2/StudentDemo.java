package az.edu.turing.module02.lesson2;

public class StudentDemo {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Tale", 28);
        System.out.println(teacher);


        Person person = new Person("Ilkin", 28);
        System.out.println(teacher);
        printMaskedName(teacher);

        printMaskedName(teacher);

    }


    private static void printMaskedName(Person person) {
        System.out.println(person.getMaskedName());
    }


}
