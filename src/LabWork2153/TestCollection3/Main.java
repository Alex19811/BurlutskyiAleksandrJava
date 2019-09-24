package LabWork2153.TestCollection3;

import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();


        for (int i = 0; i <= 10; i++) {
            list1.add("num" + i);
            list2.add("num_" + i);
        }
        Iterator<String> itr1 = list1.iterator();
        Iterator<String> itr2 = list2.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        //добавить эллементы одного списка в другой
        list2.addAll(list1);

        Iterator<String> itr3 = list2.iterator();

        while (itr3.hasNext()) {
            System.out.println(itr3.next());
            //System.out.println("шэлементы list1 в list2" + list2);
        }
//??????????
        ListIterator<String> iterator = list2.listIterator();
//        int i=0;
        while(iterator.hasNext()){
//            iterator.next();
//            iterator.add(Integer.toString(i++));
            System.out.println(iterator.next());
        }



//        list2.addLast(String.valueOf(list1));
//        System.out.println(list2);

//???????????
        //добавить эллементы одного списка в другой в обратном порядке

        }
    }




