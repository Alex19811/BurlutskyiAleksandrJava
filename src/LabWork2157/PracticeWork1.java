package LabWork2157;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PracticeWork1 {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();
        for (int i = 0; i<=10; i++){
            myCollection.add(" " +i);
        }
        Iterator<String> itr1 = myCollection.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
