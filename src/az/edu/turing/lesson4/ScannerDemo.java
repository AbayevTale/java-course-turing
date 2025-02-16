package az.edu.turing.lesson4;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is: " + number);

    }
}
