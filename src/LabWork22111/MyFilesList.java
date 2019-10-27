package LabWork22111;

import java.io.File;

public class MyFilesList {
    public static void main(String[] args) {
        File file = new File("c:\\testhile.txt");
        boolean isDirectory = file.isDirectory();
        boolean fileExists = file.exists();
        long lehgth = file.length();
        boolean sucMov = file.renameTo(new File("c:\\newfile.txt"));

    }
}
