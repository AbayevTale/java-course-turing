package az.edu.turing.module02.lesson3;

public class AbstractionDemo {


    static final String name = "Test";

    public static void main(String[] args) {

        int a = 10;
        switch (a) {
            default: System.out.println("100");
            case 10: System.out.println("10");
            case 98: System.out.println("98");
        }

        Car tesla = new Tesla();
        tesla.startEngine();
        System.out.println(tesla instanceof Car);
        System.out.println(tesla instanceof Flyable);


        Mercedes mercedes = new Mercedes();
        mercedes.startEngine();
        System.out.println(mercedes instanceof Flyable);

        mercedes.start();
        String speed = Flyable.SPEED;
    }

    public static void getCar() {


    }
}
