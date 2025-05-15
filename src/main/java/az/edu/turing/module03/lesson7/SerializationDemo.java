package az.edu.turing.module03.lesson7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user.txt"));
        outputStream.writeObject(new User("John", 25, "123456"));
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.txt"));
        User user = (User) inputStream.readObject();
        System.out.println(user);





    }
}
