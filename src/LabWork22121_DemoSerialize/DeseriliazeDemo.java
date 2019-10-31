
package LabWork22121_DemoSerialize;

import java.io.*;


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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }
}

/*
public class DeserializeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src\\com\\brainacad\\lab3_2_1\\employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ois = new ObjectInputStream(fis);
            employee = (Employee)ois.readObject();
            System.out.println(employee.getName());
            System.out.println(employee.getAddress());
            System.out.println(employee.getSSN());
            System.out.println(employee.getNumber());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}*/
