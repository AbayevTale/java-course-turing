package az.edu.turing.module03.lesson2;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    static Supplier<String> stringSupplier = () -> "Hello World";

    static Predicate<String> isBiggerThan3 = (s) -> s.length() > 3;

    static Consumer<Integer> printLength = (s) -> System.out.println(s);

    static Function<String, Integer> getLengthAsString = (s) ->  s.length();

    public static void main(String[] args) {

        String test = "Hel";
        Optional.of(test)
                .filter(isBiggerThan3)
                .map(getLengthAsString)
                .ifPresentOrElse(printLength,
                        () -> System.out.println(stringSupplier.get()));

    }
}
