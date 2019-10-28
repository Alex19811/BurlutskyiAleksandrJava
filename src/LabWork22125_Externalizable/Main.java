package LabWork22125_Externalizable;



import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] users = new String[2];
        User user = new User("Vova", "Sidorov", 26);
        User user1 = new User("Vadik", "Petrov", 21);

        FileOutputStream fos = new FileOutputStream("D:\\userfile.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.writeObject(user1);
        oos.flush();
        oos.close();

        User user2;
        FileInputStream fis = new FileInputStream("D:\\userfile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            user2 = (User) ois.readObject();
            user2.toString();

//            System.out.println("Name " + user2.getName());
//            System.out.println("Address " + employee2.getAddress());
//            System.out.println("SNN " + employee2.getSNN());
//            System.out.println("Number " + employee2.getNumber());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
//        ois.readObject();
//        ois.readObject();
//        ois.close();
//
//
//    }
//}
