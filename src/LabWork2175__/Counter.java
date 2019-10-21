package LabWork2175__;

public class Counter extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i+1000000);
            //super.run();
            try{
                sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("Boom!!!");
    }

}
