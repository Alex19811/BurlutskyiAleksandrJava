package LabWork22180_Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

/*
public class Student implements Serializable {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }


    public String toString() {
        return "Student: " +
                this.name +
                "Course: " + this.course;
    }

    Student std = new Student("Alex", "Java SE");
    try(
    Socket socket = new Socket("localhost", 8899));

    {
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        os.writeObject(std);
        os.flush();
        os.close();
    }catch(
    IOException e)

    {
        e.printStackTrace();
    }
    try(
    ServerSocket listener = new ServerSocket(8899))

    {
        Socket socket = listener.accept();
        ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
        Student std = (Student) oi.readObject();
        System.out.println(std);
        oi.close();
        socket.close();
    }catch(IOException |
    ClassNotFoundException e )

    {
        e.printStackTrace();
    }


    public static void main(String[] args) {


    }
}
*/
