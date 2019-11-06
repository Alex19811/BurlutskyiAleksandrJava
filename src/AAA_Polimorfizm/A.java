package AAA_Polimorfizm;


import static javax.print.attribute.standard.MediaSizeName.C;

/*class A {
    private String n;
    String a;
    protected String ph;
    public float ex;
}

class P extends A {
    P(String val) {
        n = val;

    }
    String getN() {
        return n;
    }
}*/




/*15
class A {
}



class D extends A {
}

class C {}



class Main {
    static int countOfc = 0;

    public static void main(String[] args) {
        A[] as = {new C(), new D(), new C()};
        for (A aa : as) {
            if (aa instanceof C)
                countOfC++;

        }
        System.out.println("Coun");
    }
}
*/



/*class Main {
    public static void main(String[] args) {
        class A {

            void j() {
                System.out.println("Cl A");
            }
        }
        class B extends A {
            void j() {
                System.out.println("Cl B");
            }

        }
    }
}*/
/*class A {
    public void s(){
        System.out.println(" S");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


    class R extends A {
        public void pr() {
            System.out.println(" P");
        }
    }
public class C extends A {
    public void c() {
        System.out.println("C");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        A[] plant = {new C(), new R()};
        for (A p : plant) {
            if (p instanceof R) {
                p.pr();
                p.s();
            }
        }
    }
}*/

/*
public class A {
    private int a =19;
    private String n= "M";

    public static void main(String[] args) {
        A b = new A();
        b.toString();
    }
    public String toString(){
        return n +" " + a+ "y";
    }
}
*/


