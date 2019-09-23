package LabWork2151.TestCollection1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();

        System.out.println(myCollection);
        for (int i = 0; i <= 10; i++) {
            myCollection.add("number_" + i);
        }

        Iterator<String> itr = myCollection.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}



