package LabWork230;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        MyWindow myWindow1 = new MyWindow(1.1, 1.3, 5, "white", true);
        MyWindow myWindow2 = new MyWindow(1.2, 1.3, 5, "white", false);
        MyWindow myWindow3 = new MyWindow(1.3, 1.3, 5, "white", true);
        MyWindow myWindow4 = new MyWindow(1.4, 1.3, 5, "white", true);
        MyWindow myWindow5 = new MyWindow(1.5, 1.3, 5, "white", true);

        myWindow1.printFilds();
        myWindow2.printFilds();
        myWindow3.printFilds();
        myWindow4.printFilds();
        myWindow5.printFilds();

        MyWindow myWindow6 = new MyWindow(2.2, 3.3);
        MyWindow myWindow7 = new MyWindow(2.2, 3.3, 5);
        myWindow6.setWidth(2.5);
        myWindow6.setHeight(3.0);

        myWindow7.setWidth(2.0);
        myWindow7.setHeight(3.0);
        myWindow7.setNumberOfGlass(3);

        myWindow6.printFilds();
        myWindow7.printFilds();

        ArrayList<String> myWindows = new ArrayList<String>();
        myWindows.add("MyWindow1");
        myWindows.add("MyWindow2");
        myWindows.add("MyWindow3");
        myWindows.add("MyWindow4");
        myWindows.add("MyWindow5");

        for (int i = 0; i < myWindows.size(); i++)
            System.out.println(myWindows.get(i));
    }

    }


