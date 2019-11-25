package AAA_Ennum;

import javafx.scene.shape.Line;
enum Animals{D("woof"), C("meow"), F ("Burble");
String sound;
Animals(String s ){sound=s;}
}

class Test {
 static Animals a;

    public static void main(String[] args) {
        System.out.println(a.D.sound + " " + a.F.sound);
    }
}

   /* public class Test {
        public static void main(String[] args) {

        }

    }*/
    /*public static void main(String[] args) {

    }
    }
*/