package LabWork2157;

import java.util.*;

public class PracticeWork6 {
    public static void main(String[] args) {
        List<String> myCollection = new LinkedList<>();
        for (int i = 0; i<=10; i++){
            myCollection.add(" " +i);
        }
        Iterator<String> itr1 = myCollection.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        //Вывести коллекцию в обратном порядке
        for (int i = myCollection.size() - 1; i >= 0; i--)
            System.out.println(myCollection.get(i));

        //или Вывести коллекцию в обратном порядке
        Collections.reverse(myCollection);
        System.out.println(myCollection);
    }
}
