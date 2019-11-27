package AAA_Generics;

/*class Pair<T1,T2> {
    T1 obj1;
    T2 obj2;
    Pair(T1 one, T2 two){
        obj1=one;
        obj2=two;
    }

    public T1 getFirst() {
        return obj1;
    }

    public T2 getSecond() {
        return obj2;
}
    }*/

/*class  Q<T> {
    T mem;
    public  Q(T arg) {
        mem = arg;
    }*/

class X{
    public <X> X (X x){}





    public static void main(String[] args) {
        //Base<Number> b = new Derived<Number>();
        //Base<Integer> b = new Derived<Integer>();
        //Base<Number> b = new Derived<Integer>();
        //Derived<Integer> b = new Derived<Integer>();
        //Derived<Number> b = new Derived<Integer>();
        //Base<Number> b = new Base<Number>();




        //Base<? extends Number> b = new Base<Number>();
        //Base<? extends Number> b = new Derived<Number>();
        //Base<? extends Number> b = new Derived<Integer>();
        //Derived<? extends Number> b = new Derived<Integer>();
        //Base<?> b = new Derived<Integer>();
        //Derived<?> b = new Derived<Integer>();




        /* Pair<Integer,String> woridC = new Pair<Integer, String>(2010,"SA");
        System.out.println("Wc "+ woridC.getFirst()+ "in " + woridC.getSecond());*/

        /*BoxP<Integer> value1 = new BoxP<Integer>(new Integer(10));
     //   Integer intV1 = value1.getVal();
        System.out.println(value1.getVal());
        BoxP<String> value2 = new BoxP<String>("HW");
        //BoxP value2 =new BoxP("HW");
        //Integer intV2 = value2.getVal();
        System.out.println(value2.getVal());
*/
        /*
BoxP<Integer> value1 = new BoxP<Integer>(new Integer(10));
        System.out.println(value1);
*/
    }
}
