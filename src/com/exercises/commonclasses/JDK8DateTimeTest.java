package com.exercises.commonclasses;

import java.time.*;

public class JDK8DateTimeTest
{
    public static void main(String[] args)
    {
//        Date date1 = new Date(2020 - 1900, 9 - 1, 8);
//        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.of(2020, 3, 15, 10, 10, 10));
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        System.out.println("-----------------------------------------");

        System.out.println(Instant.now());
        System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)));
    }
}
