package LabWork2112_TestException;

public class Main {
    public static void main(String[] args) {

        try{
            throw new MyException("MyException Test");
        } catch (MyException e){
            e.print();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("\n");

        try{
            MyTest.test();
        } catch (MyException e){
            e.print();
        } finally {
            System.out.println("Finally2");
        }

        System.out.println("\n");

        MyTest myTest = new MyTest();
        myTest = null;
        try {
            myTest.test();
        } catch (MyException e){
            e.print();
        }

    }
}
