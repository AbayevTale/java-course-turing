package az.edu.turing.module03.lesson10.service.impl;

import az.edu.turing.module03.lesson10.dao.StudentDao;
import az.edu.turing.module03.lesson10.dao.model.StudentEntity;
import az.edu.turing.module03.lesson10.model.StudentDto;
import az.edu.turing.module03.lesson10.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        StudentEntity studentEntity = new StudentEntity(
                (int) (Math.random() + 1) * 1000,
                studentDto.getName(),
                studentDto.getAge(),
                studentDto.getGrade()
        );
        studentDao.save(studentEntity);

        return studentDto;
    }
}
