package az.edu.turing.module03.lesson10.util;

import az.edu.turing.module03.lesson10.exception.StudentException;
import az.edu.turing.module03.lesson10.model.StudentDto;
import java.util.Objects;

public class StudentUtil {

    public static void checkAge(StudentDto studentDto) {
        if (Objects.nonNull(studentDto)) {
            if (studentDto.getAge() < 18) {
                throw new StudentException("Student age is less than 18");
            }
        } else {
            throw new StudentException("Student object is null");
        }
    }
}
