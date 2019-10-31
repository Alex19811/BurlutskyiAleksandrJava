package LabWork2132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek);
        }
        String myJavaDay = "My Java day: ";
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            switch (myDayOfWeek) {

                case MONDAY:
                    break;
                case WEDNESDAY:
                    break;
                case TUESDAY:
                    break;
                case THURSDAY:
                    break;
                case FRIDAY:
                    break;
                case SATURDAY: {
                    System.out.println(myJavaDay + myDayOfWeek);
                    break;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        String dayIn = scanner.next();
        MyDayOfWeek day = MyDayOfWeek.valueOf(dayIn);
        System.out.println("The next day of week: " + day.nextDay());
    }
}
/* output:
    MONDAY
    TUESDAY
    WEDNESDAY
    THURSDAY
    FRIDAY
    SATURDAY
    SUNDAY
        My Java day:SATURDAY
        My Java day:SUNDAY
    SUNDAY
    The next day of week:MONDAY
*/