package az.edu.turing.module02.lesson7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        //12-05-2020 05-12-2020 (dd-MM-yyyy)
        String currentDate = "12/12/2024"; // 12 december 2024
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(currentDate, dateTimeFormatter);

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));

    }
}
