package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014–01–20
        date = date.plusDays(2);
        System.out.println(date); // 2014–01–22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014–01–29
        date = date.plusMonths(1);
        System.out.println(date); // 2014–02–28
        date = date.plusYears(5);
        System.out.println(date); // 2019–02–28

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        System.out.println(dateTime); // 2020–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020–01–18T19:14:30

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time3 = LocalTime.of(5, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime3);

        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        date4.plusDays(10); //result is ignored
        System.out.println(date4);

        LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
//        date5 = date5.plusMinutes(1); // DOES NOT COMPILE
    }
}
