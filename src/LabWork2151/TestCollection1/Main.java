package LabWork2151.TestCollection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
        Iterator<String> itr = myColl.iterator();
        while (itr.hasNext());
        String element =itr.next();
        //????????????
        System.out.println("number_" + element);

    }

}
