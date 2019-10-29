package LabWork2175__;

public class Counter extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i);
        }
    }
}
