package LabWork22180_Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;


public class Student implements Serializable {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }


    public String toString() {
        return "Student: " + this.name +
                "Course: " + this.course;
    }

}



