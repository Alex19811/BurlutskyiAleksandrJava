package LabWork244;

public class Employee {
    String firstName;
    String lastName;
    String occupation;
    int telephone;
    public static int numberOfEmployees;




    /*public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstNam;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }
*/
    public Employee(String firstName, String lastName, String occupation, int telephone, int numberOfEmployees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        this.numberOfEmployees = numberOfEmployees;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees++;
    }

    public void setFirstNam(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setTelephone(int telepfone) {
        this.telephone = telepfone;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }
}


