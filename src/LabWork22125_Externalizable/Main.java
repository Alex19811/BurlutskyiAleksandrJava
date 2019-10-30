package LabWork22125_Externalizable;



import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User userWrite = new User("Vova", "Sidorov", 26) {
            @Override
            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

            }
        };
        User userWrite1 = new User("Vadym", "Petrov", 21) {
            @Override
            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

            }
        };

        FileOutputStream fos = new FileOutputStream("D:\\userfile.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userWrite);
        oos.writeObject(userWrite1);
        oos.flush();
        oos.close();

        User userRead;
        FileInputStream fis = new FileInputStream("D:\\userfile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        userRead = (User)ois.readObject();
        ois.close();

        System.out.println("username :" + userRead.toString());
    }
}

