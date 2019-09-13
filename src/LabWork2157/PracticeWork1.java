package LabWork2157;

import java.util.ArrayList;
import java.util.List;

public class PracticeWork1 {
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
        /*//читаємо дані по індексу
        void getData() {
            for (int i = 0; i < a1.size(); i++) {
                System.out.print(a1.get(i) + " ");
            }
        }

        //Читаємо вміст ArrayList з допомогою ітератора
        void iterateData() {
            ListIterator<String> it = a1.listIterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }*/
    }
}
