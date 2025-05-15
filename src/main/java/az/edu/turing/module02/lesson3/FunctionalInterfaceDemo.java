package az.edu.turing.module02.lesson3;


@FunctionalInterface
public abstract interface FunctionalInterfaceDemo  {

    abstract void demo();


    default void demo2() {
        System.out.println("demo2");
    }

}
