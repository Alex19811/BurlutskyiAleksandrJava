package LabWork293.TestString3;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars());
        //uniqueChars();

    }

    public static String uniqueChars() {
        String s = "Using methods of class String";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Data at [" + i + "]=" + arr[i]);

        }
        return new String();
    }
}
