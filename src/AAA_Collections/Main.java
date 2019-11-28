package AAA_Collections;

import java.awt.*;
import java.util.*;
import java.util.List;


/*
class Business{}
class Hotel extends Business{}
class Inn extends Hotel{}
public class Main{
    ArrayList<Hotel> go(){
        //return  new  ArrayList<>();
       //return new ArrayList();
      // return  new  ArrayList<Business>();
       //return  new  ArrayList<Hotel>();
       //return  new  ArrayList()<Inn>;

    }
*/


/*static  ArrayList<Integer> doS(ArrayList<Integer> values){
    values.add(new Integer(10));
    ArrayList<Integer> tempList =  new ArrayList<Integer>(values);
    tempList.add(new Integer(15));
    return tempList;*/
/*
class St{
    public St(int r){
        roll=r;
    }
int roll;
    public int haC(){
        return roll;
    }
}
*/
public class Main {

    public static void main(String [] args ) {
   /*Object o = new Object();
TreeSet s = new TreeSet();
s.add("o");
s.add(o);*/






        /*  List<Map<List<Integer>,List<String>>> l = new ArrayList<>();
     Map<List<Integer>,List<String>> m = new HashMap<>();
     l.add(null);
     l.add(m);
     l.add(new HashMap<List<Integer>,List<String>>());
     for(Map el: l){
         System.out.println(el+ "");
     }*/


        /*ArrayList <String> st = new ArrayList<String>();
        st.add("aAaA");
        st.add("AaA");
        st.add("aAa");
        st.add("AAaa");
        Collections.sort(st);
        for (String s :st){
            System.out.println(s + " ");
        }
*/
/*ArrayList<Integer> set = new ArrayList<Integer>();
set.add(1);
set.add(5);
set.add(3);
Collections.sort(set);
set.add(2);
Collections.reverse(set);
        System.out.println(set);*/




  /*HashSet<St>studs = new HashSet<>();
  studs.add(new St(5));
  studs.add(new St(10));
  studs.add(s10);
        System.out.println(studs.contains(new St(10)));
        System.out.println(studs.contains(s10));
*/




  /*Set set = new TreeSet();
     set.add("2");
     set.add("3");
     set.add("1");
     Iterator it = set.iterator();
     while (it.hasNext())
         System.out.println(it.next()+ " ");
*/
        /*   TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Dog> d = new TreeSet<Dog>();
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(d.size()+" "+ i.size());*/


    }
       /* Map<ToDos, String> m = new HashMap<ToDos, String>();
        ToDos t1 = new ToDos("M");
        ToDos t2 = new ToDos("M");
        ToDos t3 = new ToDos("T");
m.put(t1,"doL");
m.put(t2,"payB");
m.put(t3,"cleanA");
        System.out.println(m.size());
    }
}
class ToDos{
    String day;
    ToDos(String d) {day=d;}
    public boolean equals (Object o ){
        return ((ToDos)o).day==this.day;
}
public int hashCode(){return 9;}*/

/* 2 TreeSet<String> s = new TreeSet<String>();
TreeSet<String> subs = new TreeSet<String>();
s.add("a");
s.add("b");
s.add("c");
s.add("d");
s.add("e");
subs = (TreeSet)s.subSet("b", true, "d", true);
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("c2");
        System.out.println(s.size()+ "" + subs.size());*/



       /* 1 Set<String> set = new TreeSet<String>();
        set.add("S");
        set.add("R");
        Iterator<String> iter = set.iterator();
        set.add("P");
        set.add("Q");
        while (iter.hasNext()){
            System.out.println(iter.next()+ " ");
        }*/



     /*   ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 1; i<5; i++)
            nums.add(i);
        System.out.println("Original list " + nums);
        Iterator <Integer> numsIter = nums.iterator();
        while (numsIter.hasNext()){
            numsIter.remove();
        }
        System.out.println("List ... elements " + nums);*/


        /*Queue<String> loginS = new LinkedList<String>();
        loginS.add("McCartney");
        loginS.add("Lennon");
        System.out.println("The.. is: " + loginS);
        while (!loginS.isEmpty())
            System.out.println("Removing" + loginS.remove());*/

     /*4   List<int> intList= new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The" + intList);
*/

/*ArrayList<Integer> list = new ArrayList<>();
list.add(new Integer(2));
list.add(1);
list.add(5);
list.remove(2);
        System.out.println(list);*/



       /*ArrayList<String> seasons = new ArrayList<String>();
        seasons.add(1,"Spring");
        seasons.add(2,"Summer");
        seasons.add(3,"Autumn");
        seasons.add(4,"Winter");
        seasons.remove(2);
        for (String s : seasons)
            System.out.println(s + ",");*/


       /* Deque<String> myDeque = new ArrayDeque<String>(2);
        myDeque.addFirst("one");
        myDeque.addFirst("two");
        myDeque.addFirst("tree");
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.pollLast());*/





       /* List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        List list = intList;
        list.add("hello");
        for (Object o : list){
            System.out.println(o + "");
        }*/

       /* Deque<String> myDeque = new ArrayDeque<String>();
        myDeque.add("one");
        myDeque.add("two");
        myDeque.add("tree");
        System.out.println(myDeque.remove());*/


        /*String hello = "hello";
        String world = "world";
        StringBuilder hw = new StringBuilder(hello+world);
        List<String> list =ArrayList.asList(hello,world, hw.toString());
        hw.append("!");
        list.remove(0);
        System.out.println(list);*/


       /* Deque<Integer> deque = new LinkedList<>();
        deque.add(10);
        deque.add(20);
        deque.peek();
        deque.peek();
        deque.peek();
        System.out.println(deque);*/

       /* ArrayList<Object> list = new ArrayList<>();
        //list.add(new String("1234"));
        list.add(new Person());
        //list.add(new Emp());
        //list.add(new String []{"abcd","xyz"});
        System.out.println(list);*/
    }


