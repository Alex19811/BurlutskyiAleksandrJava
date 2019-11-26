package LabWork2111_TestException;

public class Main {
    public static void main(String[] args) {

        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " + Catch My Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
