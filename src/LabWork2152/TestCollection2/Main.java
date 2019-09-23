package LabWork2152.TestCollection2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();

//заполнить коллекцию
        System.out.println(myCollection);
        for (int i = 0; i <= 10; i++) {
            myCollection.add("number_" + i);
        }

        Iterator<String> itr = myCollection.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

//Перемешать коллекцию
        Collections.shuffle(myCollection);
        for (int i = 0; i <= 10; i++) {
            System.out.println(myCollection.get(i));

        }
        //или Перемешать коллекцию
        Collections.shuffle(myCollection);
        System.out.println(myCollection);
    }
}
