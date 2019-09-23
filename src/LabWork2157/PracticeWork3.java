package LabWork2157;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.swap;

public class PracticeWork3 {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();
        for (int i = 0; i<=10; i++){
            myCollection.add(" " +i);
        }
        Iterator<String> itr1 = myCollection.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
//Поменять местами элементы коллекции 0 с 9 и 1 с 8

        Collections.swap(myCollection,0,9);
        Collections.swap(myCollection,1,8);
        System.out.println(myCollection);

    }
}
