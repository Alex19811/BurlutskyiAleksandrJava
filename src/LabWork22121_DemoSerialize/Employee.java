package LabWork22121_DemoSerialize;



import java.io.*;

public class Employee implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private String address;
    private int SNN;
    private int number;

    public Employee(String name, String address, int SNN, int number) throws IOException {
        this.name = name;
        this.address = address;
        this.SNN = SNN;
        this.number = number;
        System.out.println("Constructor");
    }

    public Employee() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSNN() {
        return SNN;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSNN(int SNN) {
        this.SNN = SNN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SNN=" + SNN +
                ", number=" + number +
                '}';
    }
}
