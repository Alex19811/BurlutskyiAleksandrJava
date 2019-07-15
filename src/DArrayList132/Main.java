package DArrayList132;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
// Не надо задумываться о размере данного  списка
        /*ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 50000; i++)
            list.add(new String("AAAAAAAAA"));

            String tmp;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            tmp = list.get(i);
        System.out.println(System.currentTimeMillis() -t1);
*/


        //LinkedList

       /* LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 50000; i++)
            list.add(new String("AAAAAAAAA"));

        String tmp;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)

            // обращение к первому элементу 3 мс
            tmp = list.get(0);

        // обращение к последнему элементу 2995 мс =3 с
        tmp = list.get(list.size() - 1);

        // обращение к среднему элементу 5 мс
        tmp = list.get(list.size() / 2);
        System.out.println(System.currentTimeMillis() - t1);*/




        //преобразования массива в список
        String [] str = {"VVV", "CCC", "DDD"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
        System.out.println(list.size());

        for (int i = 0; i < 5; i++)
            list.add(new String("AAAAAAAAA"));


        long t1 = System.currentTimeMillis();


        for (int i = 0; i<list.size(); i++)
            String tmp = (list.get(i));
        System.out.println(tmp);

        //или способ итерации foraach
        for (String tmp: list)
        tmp;
            System.out.println(System.currentTimeMillis() - t1);

    }
}
