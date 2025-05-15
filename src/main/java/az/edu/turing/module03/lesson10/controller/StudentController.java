package az.edu.turing.module03.lesson10.controller;

import az.edu.turing.module03.lesson10.model.StudentDto;
import az.edu.turing.module03.lesson10.service.StudentService;
import az.edu.turing.module03.lesson10.service.impl.StudentServiceImpl;
import az.edu.turing.module03.lesson10.util.StudentUtil;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    public StudentDto createStudent(StudentDto studentDto) {
        StudentUtil.checkAge(studentDto);
        studentService.createStudent(studentDto);
        return studentDto;
    }
}
