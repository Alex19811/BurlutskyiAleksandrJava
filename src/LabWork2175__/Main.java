package LabWork2175__;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage();
        Counter run1 = new Counter();
        Thread thr1 = new Thread(run1);
        thr1.start();
    }


}
