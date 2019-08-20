package LabWork2131;

public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek dir : MyDayOfWeek.values()){
            System.out.println(dir);
        }

    }
    public enum MyDayOfWeek {SUNDAY, MONDAY}


}
