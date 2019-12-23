package LabWork22180_Networking;

import java.io.Serializable;

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



