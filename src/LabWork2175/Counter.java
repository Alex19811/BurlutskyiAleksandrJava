package LabWork2175;

public class Counter implements Runnable {

    int x = 0;
    @Override
    public void run() {
        count();
    }

    public synchronized Storage count() {
        Storage storage = new Storage();
        while (x < 1000000) {
            storage.value.add(x);
            x++;
        }
        notify();
        return storage;
    }
}
