package LabWork2157;

import java.util.*;

public class PracticeWork4 {
    public static void main(String[] args) {
        List<String> myCollection = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            myCollection.add(" " + i);
        }
        Iterator<String> itr1 = myCollection.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        //Поменять местами элементы коллекции 4 с 6 и 5 с 7
        Collections.swap(myCollection, 4, 6);
        Collections.swap(myCollection, 5, 7);
        System.out.println(myCollection);

    }
}
