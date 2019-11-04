package LabWork2176__;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

    public class DiningHall_B_C implements Callable<Runnable> {

        static int pizzaNum;
        static int studentID;

        private final String threadnumber;

        DiningHall_B_C() {
            this.threadnumber = "main";
        }

        DiningHall_B_C(String threadnumber) {
            this.threadnumber = threadnumber;
        }

        public void makePizza() {
            pizzaNum++;
        }

        public void servePizza(String servedByThread) {
            String result;
            if (pizzaNum > 0) {
                result = "Served ";
                pizzaNum--;
            } else
                result = "Starved ";
            System.out.format("%-8s %-3d by thread %s%n", result, studentID, servedByThread);
            studentID++;
        }

        public Runnable call() {
            return () -> servePizza(threadnumber);
        }

        public static void main(String[] args) {
            DiningHall_B_C d = new DiningHall_B_C();
            for (int i = 0; i < 10; i++)
                d.makePizza();

            final int NUM_THREADS = 20;
            ExecutorService exec = Executors.newFixedThreadPool(NUM_THREADS);
            List<Callable<Runnable>> callables = new ArrayList<>();
            Runnable run = () -> d.servePizza("");
            for (int i = 0; i < NUM_THREADS; i++)
                callables.add(new DiningHall_B_C(String.format("PizzaServer-%d", i)));

            try {
                List<Future<Runnable>> results = exec.invokeAll(callables);
                for (Future<Runnable> result : results) {
                    try {
                        result.get().run();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                exec.shutdownNow();
            }
        }
    }

