package chapter5;

import java.time.*;

public class DaylightSavingTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]

        LocalDate date2 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time2 = LocalTime.of(1, 30);
        ZoneId zone2 = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone2);
        System.out.println(dateTime2); // 2016–11–06T01:30–04:00[US/Eastern]
        dateTime2 = dateTime2.plusHours(1);
        System.out.println(dateTime2); // 2016–11–06T01:30–05:00[US/Eastern]
        dateTime2 = dateTime2.plusHours(1);
        System.out.println(dateTime2); // 2016–11–06T02:30–05:00[US/Eastern]

        LocalDate date3 = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time3 = LocalTime.of(2, 30);
        ZoneId zone3 = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime3 = ZonedDateTime.of(date3, time3, zone3);
        System.out.println(dateTime3); // 2016–03–13T03:30–04:00[US/Eastern]
    }
}
