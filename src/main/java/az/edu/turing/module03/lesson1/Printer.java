package az.edu.turing.module03.lesson1;

public class Printer<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

    void intValue() {
        System.out.println(value);
    }
}
