package az.edu.turing.module02.lesson3;

public abstract class Car {

    public static final String name = "";

    public Car() {
    }


    void start() {
        System.out.println("Start Engine");
    }

    protected abstract void startEngine();

    public abstract void stopEngine();
}
