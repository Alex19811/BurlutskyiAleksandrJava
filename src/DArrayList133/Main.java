package DArrayList133;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        long t1 = System.currentTimeMillis();

        //Добавление в конец списка
        for (int i = 0; i < 5; i++)
            list.add(new String("AAAAAAAAA"));

//Добавление в начало списка (время)
        for (int i = 0; i < 50000; i++)
            list.add(0, new String("AAAAAAAAA"));

//Добавление в середину списка (время)
        for (int i = 0; i < 50000; i++)
            list.add(list.size() / 2,  new String("AAAAAAAAA"));

//LinkedList
        //Добавление в середину списка (время)
        LinkedList<String> list1 = new LinkedList<>();
        long t2 = System.currentTimeMillis();

        //Добавление в середину списка (время)
        for (int i = 0; i < 50000; i++)
            list.add(list.size() / 2,  new String("AAAAAAAAA"));



    }
}
