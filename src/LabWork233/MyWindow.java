package LabWork233;

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    //проверяет наличие двух параменров
    MyWindow (double w, double h){
        width=w;
        height=h;
        System.out.println("w: " + w);
    }
//проверяет наличие трех параменров
    MyWindow (double w, double h, int n){
        width = w;
        height = h;
        numberOfGlass = n;
        System.out.println("w: " + w + " " + h + " " + n);
    }

//    public class Main {
//        public static void main(String[] args) {
//MyWindow myWindow11 = new MyWindow(1.1, 1.5);
//
//
//       }

   }


