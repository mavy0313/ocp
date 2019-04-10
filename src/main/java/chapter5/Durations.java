package chapter5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);

        Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalTime time2 = LocalTime.of(6, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        Duration duration2 = Duration.ofHours(6);
        System.out.println(dateTime2.plus(duration2)); // 2015–01–20T12:15
        System.out.println(time2.plus(duration2)); // 12:15
//        System.out.println(date2.plus(duration)); // UnsupportedTemporalException

        LocalDate date3 = LocalDate.of(2015, 1, 20);
        LocalTime time3 = LocalTime.of(6, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
        Duration duration3 = Duration.ofHours(23);
        System.out.println(dateTime3.plus(duration3)); // 2015–01–21T05:15
        System.out.println(time3.plus(duration3)); // 05:15
//        System.out.println(date3.plus(duration3)); // UnsupportedTemporalException

        LocalDate date4 = LocalDate.of(2015, 5, 25);
        Period period4 = Period.ofDays(1);
        Duration days4 = Duration.ofDays(1);
        System.out.println(date4.plus(period4)); // 2015–05–26
//        System.out.println(date4.plus(days4)); // Unsupported unit: Seconds
    }
}
