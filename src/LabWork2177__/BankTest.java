package LabWork2177__;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;


    public static void main(String[] args) {

        Bank bank = new Bank(N_ACCOUNTS,INIT_BALANCE);

        Transfer[] transfer = new Transfer[N_ACCOUNTS];
        for (int i = 0; i < transfer.length; i++) {
            transfer[i] = new Transfer(bank, i, INIT_BALANCE);
            transfer[i].start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transfer element:transfer){
            element.setStop(true);
        }
    }


        }

