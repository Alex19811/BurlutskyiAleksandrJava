package LabWork2112_TestException;

public class MyTest {

    public static void test() throws MyException{
        throw new MyException("Throwing MyException through test method in MyTest class");
    }

}