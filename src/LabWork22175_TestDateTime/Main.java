package LabWork22175_TestDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1981,01,01);
        System.out.println("Текущая дата: " + today);
        System.out.println("Дата рождения: " + birthday);
        System.out.println("Колличество лет: " + birthday.until(today).getYears());


        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Вам " + p.getYears() + " лет, " + p.getMonths() +
                " месяцев, и " + p.getDays() +
                " дней. (" + p2 + " дней прошло)");

        //День недели birthday
        System.out.println("Вы родились в (день недели):" + birthday.getDayOfWeek());

        //День недели birthday в этом году
        System.out.println("День недели birthday в этом году: " + birthday.plusYears(38).getDayOfWeek());


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse("14 11 2019", formatter);
        LocalTime time = LocalTime.parse("15:00");
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);


    }
}
