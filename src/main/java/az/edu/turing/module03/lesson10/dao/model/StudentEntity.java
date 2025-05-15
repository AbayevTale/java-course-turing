package az.edu.turing.module03.lesson10.dao.model;

import java.io.Serializable;

public class StudentEntity implements Serializable {

    private int id;
    private String name;
    private int age;
    private double grade;

    public StudentEntity(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentEntity{id=%d, name='%s', age=%d, grade=%s}".formatted(id, name, age, grade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof StudentEntity that)) {
            return false;
        }

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
