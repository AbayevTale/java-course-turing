package az.edu.turing.module03.lesson10.dao.impl;

import az.edu.turing.module03.lesson10.dao.StudentDao;
import az.edu.turing.module03.lesson10.dao.model.StudentEntity;
import az.edu.turing.module03.lesson10.exception.StudentException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class StudentFileDaoImpl extends StudentDao {

    final String STUDENT_FILE_PATH = "az/edu/turing/module03/lesson10/resource/students.txt";

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        try {
            File file = new File("students.txt");
            writeObjectToFile(studentEntity, file);

        } catch (Exception e) {
            e.printStackTrace();
            throw new StudentException(e.getMessage());

        }
        return studentEntity;
    }


    public static void writeObjectToFile(StudentEntity obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }

    }
}
