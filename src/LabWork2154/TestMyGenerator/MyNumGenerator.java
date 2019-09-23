package LabWork2154.TestMyGenerator;

import java.util.*;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    ArrayList generate() {
        //заполнить коллекцию

        for (int i = numOfElm; i <= maxNumb; i++) {
            System.out.println(i);
        }
        return new ArrayList();
    }

    void generateDistinct() {


        for (int i = numOfElm; i <= maxNumb; i++) {
            i = (int) (Math.random() * 100);
            System.out.println(i);
        }

    }
}
