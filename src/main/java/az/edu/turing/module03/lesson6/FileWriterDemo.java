package az.edu.turing.module03.lesson6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        Path file = Paths.get("test-5.txt");
        //Files.write(file, "Hello World".getBytes(StandardCharsets.UTF_16));
        System.out.println(Files.readAllLines(file, StandardCharsets.UTF_16));


    }
}
