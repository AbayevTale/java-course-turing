package az.edu.turing.module02.lesson2;

public class Teacher extends Person {

    private double salary;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        super(name, age);
        System.out.println("teacher constructor");
    }


    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void print() {
        System.out.println("Teacher");
    }

    @Override
    public String toString() {
        return "Teacher{name='%s', age=%s, salary=%s }"
                .formatted(getName(), getAge(), salary);
    }

    public String getMaskedName() {
        return super.getName().charAt(0) +
                super.getName().substring(1).replaceAll(".", "-");
    }
}
