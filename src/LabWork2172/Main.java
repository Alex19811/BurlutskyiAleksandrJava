package LabWork2172;

import LabWork2171.TestTread1.MyTimeBomb;

public class Main {

    public static void main(String[] args) {

        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread myBomb = new Thread(bomb1);
        myBomb.start();
    }
}
