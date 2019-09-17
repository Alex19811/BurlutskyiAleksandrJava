package LabWork2157;

import java.util.LinkedList;
import java.util.List;

public class PracticeWork4 {
    public static void main(String[] args) {
        List<String> myColl = new LinkedList<>();
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
        //Поменять местами элементы коллекции 4 с 6 и 5 с 7
        myColl.set(4,"6");
        myColl.set(6,"4");
        myColl.set(5,"7");
        myColl.set(7,"5");
        System.out.println(myColl);

    }
}
