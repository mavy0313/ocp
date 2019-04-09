package chapter5;

import java.time.*;

public class Periods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//        performAnimalEnrichment(start, end);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);

        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

//        Period wrong = Period.ofYears(1).ofWeeks(1); // every week

//        Period wrong = Period.ofYears(1);
//        wrong = Period.ofWeeks(1);

        System.out.println(Period.of(1, 2, 3)); //P1Y2M3D
        System.out.println(Period.ofMonths(3)); //P3M
        System.out.println(Period.of(0, 20, 47)); //P20M47D
        System.out.println(Period.ofWeeks(3)); //P21D

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period2 = Period.ofMonths(1);
        System.out.println(date.plus(period2)); // 2015–02–20
        System.out.println(dateTime.plus(period2)); // 2015–02–20T06:15
        System.out.println(time.plus(period2)); // UnsupportedTemporalTypeException
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }
}
