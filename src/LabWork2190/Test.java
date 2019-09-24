package LabWork2190;

//public class Test extends Thread {
public class Test implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hallo from thread" + i);
        }
    }
}
