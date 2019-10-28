package LabWork22125_Externalizable;

import java.io.*;

public class User implements Externalizable {
    String firstName;
    String lastName;
    int age;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBytes(firstName);
        out.writeBytes(lastName);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        age = in.readInt();

    }
}

