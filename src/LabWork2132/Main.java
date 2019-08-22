package LabWork2132;

public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek dir : MyDayOfWeek.values()) {
            //System.out.println(dir);

//            int i;
//            for (i = 0; i < MyDayOfWeek.values().length; i++) ;
            System.out.println("My java day: " + dir);

        }


    }
//    public static nextDay(){
//MyDayOfWeek.FRIDAY.
//    }

    public enum MyDayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}


}
