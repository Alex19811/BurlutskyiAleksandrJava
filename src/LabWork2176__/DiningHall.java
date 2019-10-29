package LabWork2176__;



public class DiningHall extends Thread {

    static int pizzaNum;
    static int studentID = 1;

    @Override
    public void run() {
        makePizza();
        servePizza();
        super.run();
    }

    public void makePizza() {
        pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved";
        System.out.println(result + studentID);
        studentID++;
    }

    public static class Main {
        public static void main(String[] args) {

            DiningHall d = new DiningHall();
            for (int i = 0; i < 10; i++)
                d.makePizza();
            for (int i = 1; i <= 20; i++)
                d.servePizza();



            DiningHall diningHall = new DiningHall();
            DiningHall diningHall12 = new DiningHall();
            //запуск потока
            //new DiningHall().start();
            Thread thread1 = new Thread(diningHall);
            thread1.start();
            Thread thread11 = new Thread(diningHall);
            thread11.start();
            Thread thread12 = new Thread(diningHall);
            thread12.start();
            Thread thread13 = new Thread(diningHall);
            thread13.start();
            Thread thread14 = new Thread(diningHall);
            thread14.start();
            Thread thread15 = new Thread(diningHall);
            thread15.start();
            Thread thread16 = new Thread(diningHall);
            thread16.start();
            Thread thread17 = new Thread(diningHall);
            thread17.start();
            Thread thread18 = new Thread(diningHall);
            thread18.start();
            Thread thread19 = new Thread(diningHall);
            thread19.start();

//            Synchronized(diningHal1){
//                diningHall.wait();
            //}
            Thread thread2 = new Thread(diningHall12);
            thread2.start();

        }

    }


}
