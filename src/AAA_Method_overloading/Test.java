package AAA_Method_overloading;

public class Test{

    public static void main(String[] args) {
        Test d = new Test();
        d.test(new Integer(5));
    }
        void test (long x){
            System.out.println("long");
        }

         void test (Short x){
            System.out.println("Short");
        }

//Object b = new String("aaa");
//Short b = 5;
//int i = 5;
        //foo((byte)5);
//foo1(i,i);

        /*byte b = 5;
        short s = 5;
        long l = 5;
        float f = 5.0f;
        foo(b);
        foo(s);
        foo(l);
        foo(f);*/
    }

