package LabWork2162;


import LabWork2161.Animal;
import LabWork2161.Dog;

public class Main {

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] args) {

        byte v = 1;

        foo(v);

    }

}

