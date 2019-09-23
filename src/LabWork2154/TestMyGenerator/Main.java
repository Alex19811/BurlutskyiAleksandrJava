package LabWork2154.TestMyGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyNumGenerator myNumGenerators = new MyNumGenerator(5, 64);
        myNumGenerators.generate();
        System.out.println(myNumGenerators);

        myNumGenerators.generateDistinct();
        System.out.println(myNumGenerators);

    }
}
