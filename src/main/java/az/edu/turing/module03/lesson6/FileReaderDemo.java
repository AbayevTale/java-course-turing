package az.edu.turing.module03.lesson6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderDemo {


    public static void main(String[] args) {


        try (FileInputStream fileInputStream = new FileInputStream("test-2.png");
             FileOutputStream fileOutputStream = new FileOutputStream("test-3.png"))
        {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
