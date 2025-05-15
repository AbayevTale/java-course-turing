package az.edu.turing.module02.lesson3;

public interface Flyable {

    String SPEED = "speed";

    void fly();
    void fly2();


    default void stop() {
        System.out.println("Stop Engine with card ");
    }

    static void stop2() {
        System.out.println("Stop Engine with card ");
    }


}
