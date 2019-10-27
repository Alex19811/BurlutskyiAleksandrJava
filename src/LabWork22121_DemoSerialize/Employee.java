package LabWork22121_DemoSerialize;

import com.sun.org.apache.bcel.internal.generic.NEW;

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
        return super.toString();
    }

    public static void main(String[] args) throws IOException {


        Employee employee = new Employee("Sasha", "Vinnitsa", 111, 1);
        FileOutputStream fos = new FileOutputStream("D:\\employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }


    }
}
