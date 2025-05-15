package az.edu.turing.module03.lesson10.dao.impl;

import az.edu.turing.module03.lesson10.dao.StudentDao;
import az.edu.turing.module03.lesson10.dao.model.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentInMemoryDaoImpl extends StudentDao {

    List<StudentEntity> STUDENT_ENTITIES = new ArrayList<>();

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        System.out.println(STUDENT_ENTITIES);
        STUDENT_ENTITIES.add(studentEntity);
        System.out.println(STUDENT_ENTITIES);
        return studentEntity;
    }
}
