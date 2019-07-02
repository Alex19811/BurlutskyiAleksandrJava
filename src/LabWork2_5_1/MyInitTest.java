package LabWork2_5_1;

public class MyInitTest {
    private static int a;

    {
        a = 1;
    }

    private static int b;

    {
        b = 2;
    }

    private int c;

    {
        c = 5;
    }

    private String str;

    {

        str = "block1";
    }

    public static void main(String[] arg) {
        MyInitTest myInitTest = new MyInitTest();
        System.out.println("initialization block1" + myInitTest);

    }


}

