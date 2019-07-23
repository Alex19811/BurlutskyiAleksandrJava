package D142AbstractClass.Concert;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Composer c1 = new Krug();
        Composer c2 = new Bach();

        ArrayList<Composer> concert = new ArrayList<>();
        concert.add (c1);
        concert.add(c2);
        concert.add (new Bach());
        concert.add (new Krug());
        concert.add(new Composer() {
            @Override
            public String music() {
                return "AAAAAAAAAAAAA";
            }
        });

        //перемешать коллекцию
        Collections.shuffle(concert);

        for (Composer composer:concert) {
            System.out.println(composer.music());
        }


    }

}
