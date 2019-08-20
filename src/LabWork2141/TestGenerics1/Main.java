package LabWork2141.TestGenerics1;

public class Main {
    public static void main(String[] args) {
        MyTuple <String,Integer,Long> myTuple = new MyTuple<>("AAA",1,1212222222L);
        MyTuple <Double,String,String> myTuple1 = new MyTuple<>(1.5,"BBB","CCC");
    }
}
