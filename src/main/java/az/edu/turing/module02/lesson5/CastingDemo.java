package az.edu.turing.module02.lesson5;

public class CastingDemo {

    public static void main(String[] args) {

        int number;

        B b = new B();
        A a = new C();
        //
        A ab = new B();
        C c;
        c = (C) a;
        c.print();

    }
}

class A {

    public A() {
    }
}

class B extends A {

    public B() {
        super();
    }
}

class C extends A {
    public C() {
        super();
    }

    public void print() {
        System.out.println("Test");
    }
}