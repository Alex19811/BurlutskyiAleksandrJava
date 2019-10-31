package LabWork22111;

import java.io.File;

public class MyFilesList {

    public static void main(String[] args) {

        File file = new File("D:\\");
        File[] listOfFiles = file.listFiles();
        method("", listOfFiles);

    }

    public static void method(String separator, File[] listOfFiles) {

        for (File f : listOfFiles) {
            System.out.println(separator + f.getName());
            if (f.isDirectory()) {
                separator += "  ";
                method(separator, f.listFiles());
                separator = "  ";

            }


        }

    }
}
