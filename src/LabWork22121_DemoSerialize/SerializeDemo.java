package LabWork22121_DemoSerialize;

import java.io.*;

public class SerializeDemo extends Employee implements Serializable {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee("Sasha", "Vinnitsa", 111, 1) {
            @Override
            public void writeExternal(ObjectOutput out) throws IOException {

            }
        };
        FileOutputStream fos = new FileOutputStream("D:\\employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println(employee.toString());
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }
}

/*
public class SerializeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Vladimir");
        employee.setAddress("Kelecjka street");
        employee.setSSN(5264);
        employee.setNumber(981251251);

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src\\com\\brainacad\\lab3_2_1\\employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/
