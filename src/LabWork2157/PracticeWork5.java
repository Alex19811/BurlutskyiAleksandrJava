package LabWork2157;

import java.util.ArrayList;
import java.util.List;

public class PracticeWork5 {
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
        //Вывести коллекцию в обратном порядке
        for (int i = myColl.size() - 1; i >= 0; i--)
            System.out.println(myColl.get(i));

    }
}
