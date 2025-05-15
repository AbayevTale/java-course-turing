package az.edu.turing.module03.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

    public static void main(String[] args) {

        String[] stringArr = new String[1];
        stringArr[0] = "hello";

        //stringArr[1] = "world";



        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Hello 2");
        //.get(5);
        System.out.println(linkedList);


        HashMap<String, String> map = new HashMap<>();
        map.put("FB", "Hello 5");
        map.put("Ea", "Hello");
        map.put("AA", "Hello 2 ");

        System.out.println(map);

        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());

        Person person = new Person("Rasul", 20);
        Person person2 = new Person("Nicat", 20);
        System.out.println(person.equals(person2));

        HashMap<Person, String> personMap = new HashMap<>();
        personMap.put(person, "Rasul");
        personMap.put(person2, "Nicat");
        System.out.println(personMap);
        personMap.put(null, null);
        System.out.println(personMap.get(10));
        personMap.put(person, null);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("FB", "Hello 5");
        linkedHashMap.put("Ea", "Hello");
        linkedHashMap.put("EB", "Hello 2");
        System.out.println(linkedHashMap);


        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        System.out.println(integers.size());


        integers.parallelStream().forEach(System.out::println);
    }



}
