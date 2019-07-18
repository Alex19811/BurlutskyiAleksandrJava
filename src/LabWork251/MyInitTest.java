package LabWork251;

public class MyInitTest {

    private static int a;
    private String c;
    private String d ;

    static {
        a = 1;
        System.out.println("static initialization block 1");
    }

    private static final Object String;

    static {
        String = "static initialization block 2";
        System.out.println(String);
    }

    {
        c = "non-static initialization block 1";
        System.out.println(c);
    }

    {
        d = "non-static initialization block 2";
        System.out.println(d);
    }

//// Этот конструктор вызывает конструктор с параметром (вызов второго конструктора)
    public MyInitTest() {
        this(a);
    System.out.println("conctructor 2");

    }
    public MyInitTest (int a) {
        System.out.println("conctructor 1");

    }

}

