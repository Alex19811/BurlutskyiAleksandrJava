package AAA_Sersalization;

import java.io.*;
import java.sql.SQLOutput;
/*
class Food implements Serializable {
    public int x, y;

    public Food(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.writeInt(x);
        s.writeInt(y);
    }

    private void readObject(ObjectOutputStream s) throws IOException,
            ClassNotFoundException {
        s.defaultReadObject();
    }
}
*/


    /*
class Fruit extends Food{
    int juice = 5;
}
public class Banana extends Fruit{
    int yellow = 5;

    public static void main(String[] args) {
        Banana b = new Banana();
        Banana b2 = new Banana();
        b.serializeBanana(b);
        b2 = b.serializeBanana();
        System.out.println("restore" + b.yellow+b2.juice+ b2.good);
    }

    private Banana serializeBanana(Banana b) {
        return b;
    }
}
*/
/*class Food implements Serializable {
    int good = 3;

}
class Fruit extends Food{
    int juice = 5;
}
public class Banana extends Fruit{
    int yellow = 5;

    public static void main(String[] args) {
        Banana b = new Banana();
        Banana b2 = new Banana();
        b.serializeBanana(b);
        b2 = b.serializeBanana();
        System.out.println("restore" + b.yellow+b2.juice+ b2.good);
    }

    private Banana serializeBanana(Banana b) {
        return b;
    }
}*/

/*public class Streams {
public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(5);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("Serializ");
            System.exit(0);
        }
        try {
            int z;
            FileInputStream fis = new FileInputStream("ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            z = ois.readInt();
            ois.close();
            System.out.println(ois.readFloat());
        } catch (Exception e) {
            System.out.println("Deserializ");
            System.exit(0);
        }
    }

}*/
/*class Pl {
    Pl() {
        System.out.print("p");
    }

    static class CardPl extends Pl implements Serializable {
        CardPl() {
            System.out.println("c");
        }

        public static void main(String[] args) {
            CardPl c1 = new CardPl();
            try {
                FileOutputStream fos = new FileOutputStream("play.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(c1);
                oos.close();

        *//*} catch (Exception e) {
            System.out.println("Serializ");
            System.exit(0);
        }
        try {*//*
                FileInputStream fis = new FileInputStream("play.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                CardPl c2 = new CardPl();
                ois.close();
            } catch (Exception x) {
            }

        }
    }*/

//}
/*
public class Streams {
public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("Serializ");
            System.exit(0);
        }
        try {
            FileInputStream fis = new FileInputStream("ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readFloat());
        } catch (Exception e) {
            System.out.println("Deserializ");
            System.exit(0);
        }
    }

}*/
