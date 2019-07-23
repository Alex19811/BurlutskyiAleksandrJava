package D131ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// Не надо задумываться о размере данного  списка
        ArrayList<String> list = new ArrayList<>();
        list.add("AAAA");
        list.add("BBBB");
        list.add("CCCC");
        //добавление элемента а не замена
        list.add(1, "DDDD");


        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
