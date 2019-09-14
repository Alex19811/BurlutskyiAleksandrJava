package LabWork2157;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeWork3 {
    public static void main(String[] args) {
        List<String> myColl = new ArrayList<>();
        myColl.add("0");
        myColl.add("1");
        myColl.add("2");
        myColl.add("3");
        myColl.add("4");
        myColl.add("5");
        myColl.add("6");
        myColl.add("7");
        myColl.add("8");
        myColl.add("9");
        myColl.add("10");
        System.out.println(myColl);
//Поменять местами элементы коллекции 0 с 9 и 1 с 8
        myColl.set(0,"9");
        myColl.set(9,"0");
        myColl.set(1,"8");
        myColl.set(8,"1");
        System.out.println(myColl);

    }
}
