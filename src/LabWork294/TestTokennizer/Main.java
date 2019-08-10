package LabWork294.TestTokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer s1 = new StringTokenizer(myStr, " ");
        StringTokenizer s2 = new StringTokenizer(myStr, ",");
        StringTokenizer s3 = new StringTokenizer(myStr, ".dot");
        while (s1.hasMoreElements()) {
            System.out.println(s1.nextElement());
        }
        while (s2.hasMoreElements()) {
            System.out.println(s2.nextElement());
        }

        while (s3.hasMoreElements()){


            System.out.println(s3.nextElement());
        }
    }
}
