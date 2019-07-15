package DAccount110;

public class Main {
    // метод для снятия денег со счета (от куда, сколько)
    public static void withDraw (Account account, double value){

    }
    public static void main(String[] args) {

        Account client = new Account();
        System.out.println(client.name + " " +client.pin+ " " + client.amount);
        client.name = new String("AAA");
        client.pin = 1111;
        client.setAmount (12.5);
        System.out.println(client.name + " " +client.pin+ " " + client.amount);
    }
    }
