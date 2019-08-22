package LabWork2133;


import java.util.Scanner;

public class Main {
    public enum MyDayOfWeek{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        void nextDay() {
            MyDayOfWeek myDay = this;
            MyDayOfWeek[] myDayOfWeeks = MyDayOfWeek.values();
            if (myDay.ordinal() != 6)
                System.out.println(myDayOfWeeks[myDay.ordinal() + 1]);
            else
                System.out.println(myDayOfWeeks[0]);
        }
    }

    public static void main(String[] args) {
        Scanner getDay = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String myDay = getDay.nextLine();

        MyDayOfWeek nextDayVal = MyDayOfWeek.valueOf(myDay);

        nextDayVal.nextDay();

    }
}