package az.edu.turing.module03.lesson10;

import az.edu.turing.module03.lesson10.controller.StudentController;
import az.edu.turing.module03.lesson10.dao.StudentDao;
import az.edu.turing.module03.lesson10.dao.impl.StudentFileDaoImpl;
import az.edu.turing.module03.lesson10.dao.impl.StudentInMemoryDaoImpl;
import az.edu.turing.module03.lesson10.model.StudentDto;
import az.edu.turing.module03.lesson10.service.StudentService;
import az.edu.turing.module03.lesson10.service.impl.StudentServiceImpl;

public class StudentManagementApp {

    public static void main(String[] args) {

        StudentDto studentDto = new StudentDto("Rasul", 20, 81);

        StudentDao studentDao = new StudentFileDaoImpl();
        StudentService studentService = new StudentServiceImpl(studentDao);
        StudentController studentController = new StudentController(studentService);

        StudentDto student = studentController.createStudent(studentDto);
        System.out.println(student);


    }
}
