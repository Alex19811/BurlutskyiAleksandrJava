package DSetAndGet112;

public class Main {
    public static void main(String[] args) {
        double d = 200;
        Account client = new Account(d);
        System.out.println(client.getAmount());
        client.setAmount( d + d );
        System.out.println(client.getAmount());
    }

}
