package LabWork2171.TestTread1;

public class MyTimeBomb extends Thread {


    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
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
