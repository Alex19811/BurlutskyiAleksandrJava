package LabWork235;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
            /*MyWindow[] MyWindow1 = new MyWindow[5];

            MyWindow1[0] = new MyWindow(2.2, 3.3, 3);
            MyWindow1[1] = new MyWindow(2.2, 3.3, 3);
            MyWindow1[2] = new MyWindow(2.2, 3.3, 3);
            MyWindow1[3] = new MyWindow(2.2, 3.3, 3);
            MyWindow1[4] = new MyWindow(2.2, 3.3, 3);

            for (int i = 0; i < MyWindow1.length; i++)
                System.out.println(MyWindow1[i].toString());*/

        ArrayList<String> myWindows = new ArrayList<String>();
        myWindows.add("MyWindow1");
        myWindows.add("MyWindow2");
        myWindows.add("MyWindow3");
        myWindows.add("MyWindow4");
        myWindows.add("MyWindow5");

        //Содержимое списочного массива
        System.out.println(myWindows);

        // размер массива
        for (int i = 0; i < myWindows.size(); i++)
        System.out.println(myWindows.get(i));
    }

        }




