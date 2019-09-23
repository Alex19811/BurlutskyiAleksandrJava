package LabWork2157;

import java.util.*;

public class PracticeWork5 {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();
        for (int i = 0; i<=10; i++){
            myCollection.add(" " +i);
        }
        Iterator<String> itr1 = myCollection.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        ListIterator<String> listIterator = myCollection.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + " ");
        }
        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }

        //или Вывести коллекцию в обратном порядке
        Collections.reverse(myCollection);
        System.out.println(myCollection);

    }
}
