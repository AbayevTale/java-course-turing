package az.edu.turing.module03.lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {


    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "");
        stream.forEach(System.out::println);


        List<String> list = List.of("a", "b", "c");

        Stream<String> string = list.stream();


        Set<Integer> integerSet = Set.of(1, 2);
        int sum = 0;
        for (Integer integer : integerSet) {
            sum += integer;
        }
        System.out.println(sum);

        integerSet.stream()
                .reduce((integer, integer2) -> integer + 2 * integer2)
                .ifPresent(System.out::println);


        for (Integer integer : integerSet) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        integerSet.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("Ali", "Nicat", "Shaiq", "Nicat", "Ali");
        Set<String> nameSet = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(nameSet);


        List<List<String>> lists = Arrays.asList(names, list);
        System.out.println(lists);

        List<String> stringList = lists.stream()
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toList());
        System.out.println(stringList);


        List<String> names2 = Arrays.asList("Ali", "Nicat", "Saiq");


    }
}
