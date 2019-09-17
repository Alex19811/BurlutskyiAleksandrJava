package LabWork2153.TestCollection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.addAll;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myColl = new ArrayList<>();
        LinkedList<String> myCollec = new LinkedList<>();


        for (int i = 0; i <= 10; i++) {
            myColl.add("number_" + i);
            myCollec.add("num_" + i);
        }
        Iterator<String> itr1 = myColl.iterator();
        Iterator<String> itr2 = myCollec.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
