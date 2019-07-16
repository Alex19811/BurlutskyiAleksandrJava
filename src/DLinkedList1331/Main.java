package DLinkedList1331;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Teacher> list = new LinkedList<>();
        long t1 = System.currentTimeMillis();


        Teacher teacher = new Teacher("SergD", 5);
        list.add(teacher);
        list.add(new Teacher("SergM", 15));
        list.add(0, new Teacher("Tanya", 21));

//Вытягиваем елементы (teacher1) из списка
        for (Teacher teacher1 : list) {
            System.out.println(teacher1.toString());
        }

        //или полная анналогия кода
        /*for (int i = 0; i < list.size(); i++)
            Teacher teacher1;
        teacher1 = list.get(i);
        System.out.println(teacher1.toString());*/


    }
}
