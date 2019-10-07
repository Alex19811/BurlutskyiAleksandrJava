package LabWork2173.TestTread2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        MySumCount mySumCount = new MySumCount(0,1000);
        MySumCount mySumCount1 = new MySumCount(0,1000);


//        mySumCount.setStartindex(0);
//        mySumCount.setStopindex(1000);
//        mySumCount1.setStartindex(0);
//        mySumCount1.setStopindex(1000);

        mySumCount.myArrayAdd();
        mySumCount1.myArrayAdd();

        Thread thread = new Thread(mySumCount);
        Thread thread1 = new Thread(mySumCount1);

        thread.start();
        thread1.start();
    }
}


//        for (int i =0; i <= maxNumb; i++) {
//            maxNumb = (int) (Math.random() * 64);
//            System.out.println(i);
//
//
//mySumCount.start();
//mySumCount1.start();
//
//        int myArray[ 1000];
//        MySumCount myArray = MySumCount(1, 10);
//        ArrayList<Integer> myArray = new ArrayList<>();
//        for (int i = 0; i <= 1000; i++) {
////        list1.add("num" + i);
//
//        }
//    }
//}
