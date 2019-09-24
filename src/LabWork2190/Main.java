package LabWork2190;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main start");
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();
//        Test test = new Test();
//        test.setDaemon(true);
//        test.run();
//        test.start();
        thread.setPriority(10);
        for (int i = 0; i < 100; i++) {
            System.out.println("Hallo from Main" + i);
        }
        System.out.println("Main thread");

    }
}
