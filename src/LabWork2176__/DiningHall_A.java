package LabWork2176__;

public class DiningHall_A {
    static int pizzaNum;
    static int studentID;

    public synchronized void makePizza() {
        pizzaNum++;
    }

    public synchronized void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else
            result = "Starved ";
        System.out.format("%-8s %-3d by thread %s%n", result, studentID, Thread.currentThread().getName());
        studentID++;
    }

    public static void main(String[] args) {
        DiningHall_A d = new DiningHall_A();
        for (int i = 0; i < 10; i++)
            d.makePizza();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> d.servePizza(), String.format("PizzaServer-%d", i)).start();
        }
    }
}

