package az.edu.turing.module02.lesson5;

import static az.edu.turing.module02.lesson4.OrderStatus.DELIVERED;
import static az.edu.turing.module02.lesson4.OrderStatus.ORDERED;
import static az.edu.turing.module02.lesson4.OrderStatus.READY;
import static az.edu.turing.module02.lesson4.OrderStatus.checkOrderStatus;

import az.edu.turing.module01.lesson7.Student;
import az.edu.turing.module02.lesson4.OrderStatus;
import java.util.*;
import java.lang.*;


import java.util.Scanner;

public class PackageDemo {

    public static void main(String[] args) {

        System.out.println(ORDERED);
        System.out.println(READY);
        checkOrderStatus(ORDERED);
        System.out.println(DELIVERED);

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Date date = new Date();
        List<String> strings ;
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }
}
