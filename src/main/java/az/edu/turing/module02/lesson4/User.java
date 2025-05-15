package az.edu.turing.module02.lesson4;

import az.edu.turing.module02.lesson4.enums.Gender;
import java.util.Arrays;

public final class User {

    private final StringBuilder name;
    private final String surname;
    private final Gender gender;
    private final int[] grade = new int[] {50, 60, 80};

    public User(StringBuilder name, String surname, Gender gender) {
        this.name = new StringBuilder(name);
        this.surname = surname;

        this.gender = gender;
    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public String getSurname() {
        return surname;
    }

    public int[] getGrade() {
        return Arrays.copyOf(grade, grade.length);
    }



    @Override
    public String toString() {
        return "User{name='%s', surname='%s', grade=%s}".formatted(name, surname, Arrays.toString(grade));
    }
}
