package LabWork244;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Oleg","A","QA",552515, 1);
        Employee employee2 = new Employee("Dima", "B", "QA",552525, 1);
        Employee employee3 = new Employee("Serg", "C", "QA",552522, 1);
        Employee employee4 = new Employee("Tanya", "D", "QA",552555, 1);


        System.out.println(employee1.getNumberOfEmployees());
        System.out.println(employee2.getNumberOfEmployees());
        System.out.println(employee3.getNumberOfEmployees());
        System.out.println(employee4.getNumberOfEmployees());

    }
}
