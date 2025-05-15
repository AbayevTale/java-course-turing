package az.edu.turing.module03.lesson1;

import java.io.Serializable;

public class NumberPrinter<T extends Number & Serializable> extends Printer<T> {

    @Override
    public void print() {
        System.out.println(getValue().intValue());
    }

    public void setValue(Comparable<? extends Number> value) {

    }
}
