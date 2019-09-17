package LabWork2153.TestCollection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.addAll;

public class Main {
    public static void main(String[] args) {
        List<String> myColl = new ArrayList<>();
        myColl.add("number_0");
        myColl.add("number_1");
        myColl.add("number_2");
        myColl.add("number_3");
        myColl.add("number_4");
        myColl.add("number_5");
        myColl.add("number_6");
        myColl.add("number_7");
        myColl.add("number_8");
        myColl.add("number_9");
        myColl.add("number_10");
        System.out.println(myColl);
        for (int i = 0; i <= 10; i++)
            System.out.println(myColl.get(i));

        List<String> myCollec = new LinkedList<>();
        myCollec.add("number_100");
        myCollec.add("number_101");
        myCollec.add("number_102");
        myCollec.add("number_103");
        myCollec.add("number_104");
        myCollec.add("number_105");
        myCollec.add("number_106");
        myCollec.add("number_107");
        myCollec.add("number_108");
        myCollec.add("number_109");
        myCollec.add("number_110");
        System.out.println(myCollec);
        for (int i = 0; i <= 10; i++)
            System.out.println(myCollec.get(i));


        Iterator<String> itr = myColl.iterator();
        while (itr.hasNext()) ;
        String element = itr.next();
        //????????????
        System.out.println("number_" + element);

        Iterator<String> itr1 = myCollec.iterator();
        while (itr1.hasNext()) ;
        String element1 = itr.next();
        //????????????
        System.out.println("number_" + element1);

        myColl.addAll(myCollec);
        System.out.println(myColl);
    }
}
