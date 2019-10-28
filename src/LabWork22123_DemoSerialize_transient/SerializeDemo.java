package LabWork22123_DemoSerialize_transient;

import LabWork22121_DemoSerialize.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo extends Employee implements Serializable {
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
        System.out.println(employee.toString());
    }
}
