package az.edu.turing.module03.lesson7;

import java.io.Serializable;

@VeryImportantMethod
public class User implements Serializable {

    private String name;
    public int age;
    private String password;


    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Print(times = 3)
    private void printInfo(String info) {
        System.out.println(info);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "User{name='%s', age=%d, password='%s'}".formatted(name, age, password);
    }
}
