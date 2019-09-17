package LabWork2151.TestCollection1;

import java.util.*;

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

        Iterator<String> itr = myColl.iterator();
        while (itr.hasNext()) ;
        String element = itr.next();
        //????????????
        System.out.println("number_" + element);

    }
}



