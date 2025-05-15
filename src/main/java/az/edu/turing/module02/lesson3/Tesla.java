package az.edu.turing.module02.lesson3;

public class Tesla extends Car implements Swimmable, Flyable {

    public Tesla() {
        super();
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine with card ");
    }


    @Override
    public void stopEngine() {

    }

    @Override
    public void fly() {
        System.out.println("Fly with ");
    }

    @Override
    public void fly2() {

    }

    @Override
    public void swim() {

    }


    @Override
    public void stop() {
        Flyable.super.stop();
    }
}
