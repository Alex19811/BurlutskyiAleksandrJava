package LabWork2112_TestException;

public class MyException extends Exception {
    protected String reference;

    MyException(String reference){
        this.reference = reference;
    }

    public void print(){
        System.out.println(reference);
    }
}
