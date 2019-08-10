package LabWork292.TestString2;

public class Main<l, myStrl> {
    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        String myStr3 = myStr1.replaceAll("[" + myStr2 + "]", "");
        System.out.println(myStr3);
    }

}

