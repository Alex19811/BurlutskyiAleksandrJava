package LabWork2132;

public enum MyDayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    MyDayOfWeek nextDay() {
        int nextDayOfWeek = MyDayOfWeek.this.ordinal();
        ++nextDayOfWeek;
        if (nextDayOfWeek == MyDayOfWeek.values().length) {
            nextDayOfWeek = 0;
        }
        return MyDayOfWeek.values()[nextDayOfWeek];
    }
}
