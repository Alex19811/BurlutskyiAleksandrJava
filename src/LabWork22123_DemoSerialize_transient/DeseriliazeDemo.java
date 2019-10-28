package LabWork22123_DemoSerialize_transient;

import LabWork22121_DemoSerialize.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeseriliazeDemo extends Employee implements Serializable {
    public static void main(String[] args) throws IOException {

        Employee employee2;
        FileInputStream fis = new FileInputStream("D:\\employee.ser");
        ObjectInputStream oin = new ObjectInputStream(fis);
        try {
            employee2 = (Employee) oin.readObject();
            System.out.println("Name " + employee2.getName());
            System.out.println("Address " + employee2.getAddress());
            System.out.println("SNN " + employee2.getSNN());
            System.out.println("Number " + employee2.getNumber());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            oin.close();
        }
    }

}

