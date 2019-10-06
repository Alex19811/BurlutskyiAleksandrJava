package LabWork2173.TestTread2;

import java.util.ArrayList;


public class MySumCount extends Thread {
    int startindex;
    int stopindex;
    long resultSum;


    public MySumCount(Runnable target, int startindex, int stopindex) {
        super(target);
        this.startindex = startindex;
        this.stopindex = stopindex;
    }

    public int getStartindex() {
        return startindex;
    }

    public int getStopindex() {
        return stopindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public void setStopindex(int stopindex)
    {
        this.stopindex = stopindex;
    }

    ArrayList<Integer> myArray = new ArrayList<>();

    public void myArrayAdd() {
        for (int i = getStartindex(); i <= getStopindex(); i++) {
//getStopindex = ((int) (Math.random() * 1000));
            myArray.add(i);
            System.out.println(i);
            System.out.println(myArray);
        }
    }

    public void setMyArray(ArrayList<Integer> myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    public MySumCount() {

        super();
    }

    @Override
    public void run() {

        for (int i = 0; i <= myArray.size(); i++) {
            for (int num : myArray)
                resultSum += myArray.get(i);
            //  resultSum = resultSum + num;
            try{
                sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(resultSum);



////
//            int sum = 0;
//            // цикл для обхода каждого элемента массива
//            for (int num : list1) {
//
//                // суммирование каждого элемента массива
//                sum = sum + num;
//            }
//            System.out.println("Сумма элементов массива равна: " + sum);
        }


    }
}
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//            //super.run();
//            try{
//                sleep(1000);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
//}

