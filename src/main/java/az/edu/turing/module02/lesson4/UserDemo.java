package az.edu.turing.module02.lesson4;

import az.edu.turing.module02.lesson4.enums.Gender;
import java.util.Arrays;

public class UserDemo {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Mansura");

        User user = new User(name, "Badalov", Gender.FEMALE);

        System.out.println(user.getName());
        name.append("   ");
        user.getName().append("  ");
        System.out.println(user.getName());
        System.out.println(user.getSurname());



        System.out.println(Arrays.toString(user.getGrade()));
        System.out.println(user);
    }
}
