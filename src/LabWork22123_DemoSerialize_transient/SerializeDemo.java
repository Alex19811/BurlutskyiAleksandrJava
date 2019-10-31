package LabWork22123_DemoSerialize_transient;

import LabWork22121_DemoSerialize.Employee;

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
