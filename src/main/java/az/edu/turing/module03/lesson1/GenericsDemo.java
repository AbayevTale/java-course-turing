package az.edu.turing.module03.lesson1;

import java.io.Serializable;
import java.math.BigInteger;

public class GenericsDemo {


    public static void main(String[] args) {

        Printer<Car> printer = new Printer<>();
        NumberPrinter<Number> numberPrinter = new NumberPrinter<>();
      //  numberPrinter.setValue(Integer.valueOf(10));
        numberPrinter.print();

        NumberPrinter< Number> numberPrinter2 = new NumberPrinter<>();
       // numberPrinter2.setValue(Integer.valueOf(10));

        numberPrinter2.setValue(
                new Comparable<Double>() {
            @Override
            public int compareTo(Double number) {
                return 0;
            }
        });


        Printer<?> printer2 = new Printer<>();



    }

    public static <T> void print(T value, T value2) {

    }


}
