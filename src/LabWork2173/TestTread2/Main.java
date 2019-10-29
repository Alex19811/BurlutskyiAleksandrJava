package LabWork2173.TestTread2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        MySumCount mySumCount = new MySumCount(0,1000);
        //MySumCount mySumCount1 = new MySumCount(0,1000);


        mySumCount.myArrayAdd();
      //  mySumCount1.myArrayAdd();

        Thread thread = new Thread(mySumCount);
        Thread thread1 = new Thread(mySumCount);

        thread.start();
        thread1.start();
   //??????
       /* thread.join();
        thread1.join();*/
    }
}
