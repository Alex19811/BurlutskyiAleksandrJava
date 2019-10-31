package LabWork2177__;


import java.util.Random;

public class Transfer extends Thread implements Runnable {

        private Bank bank;
        private int from;
        private int max;
        private boolean stop = false;

        public Transfer(Bank bank, int from, int max) {
            this.bank = bank;
            this.from = from;
            this.max = max;
        }

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        @Override
        public void run(){
            Random random = new Random();

            while (!stop) {

                bank.transfer(from, random.nextInt(bank.getNumberAccounts()), random.nextInt(max));
            }
        }
    }

