package LabWork2115_TestException;

public class Main {
    public static void main(String[] args) {

        long l = 5L;
        float f = 5.2f;
        double d = l + f;

        assert compute(5L,5.2f)== 50;

    }

    public static Double compute(Long l, Float f){
        return (double)(l + f);
    }
}
