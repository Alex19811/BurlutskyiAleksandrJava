package LabWork2113_TestException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(125);
        } catch (InvalidAgeException e){
            System.out.println("The age is incorrect. Change the age");
        }



    }
}
