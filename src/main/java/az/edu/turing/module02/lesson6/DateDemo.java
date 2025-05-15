package az.edu.turing.module02.lesson6;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.now(Clock.systemUTC());

        Date date1 = new Date(Calendar.DATE);

        System.out.println(date1);


    }
}
