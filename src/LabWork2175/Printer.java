package LabWork2175;

public class Printer implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread threadPrinter = new Thread(printer);
        threadPrinter.start();
        synchronized (threadPrinter){
            try {
                threadPrinter.wait();
            }
            catch (InterruptedException e){}
        }
    }

    Counter counter = new Counter();
    Thread threadCounter = new Thread(counter);

    @Override
    public void run() {
        threadCounter.start();
        Storage storage = counter.count();
        for (int i : storage.value) {
            System.out.println(i);
        }
    }
}

