package LabWork231;

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public static void main(String args[]) {
        MyWindow myWindow1 = new MyWindow();
        MyWindow myWindow2 = new MyWindow();
        MyWindow myWindow3 = new MyWindow();
        MyWindow myWindow4 = new MyWindow();
        MyWindow myWindow5 = new MyWindow();

        myWindow1.width = 1.1;
        myWindow1.height = 1.3;
        myWindow1.numberOfGlass = 5;
        myWindow1.color = "white";
        myWindow1.isOpen = true;

        myWindow2.width = 1.2;
        myWindow2.height = 1.3;
        myWindow2.numberOfGlass = 5;
        myWindow2.color = "white";
        myWindow2.isOpen = true;

        myWindow3.width = 1.3;
        myWindow3.height = 1.3;
        myWindow3.numberOfGlass = 5;
        myWindow3.color = "white";
        myWindow3.isOpen = false;

        myWindow4.width = 1.4;
        myWindow4.height = 1.3;
        myWindow4.numberOfGlass = 5;
        myWindow4.color = "white";
        myWindow4.isOpen = true;

        myWindow5.width = 1.5;
        myWindow5.height = 1.3;
        myWindow5.numberOfGlass = 5;
        myWindow5.color = "white";
        myWindow5.isOpen = true;

       printFilds  (); {
            System.out.println("My window1: width - " + myWindow1.width + ", "
                    + " height - " + myWindow1.height + ", "
                    + " numberOfGlass - " + myWindow1.numberOfGlass + " ,"
                    + " color - " + myWindow1.color + ", "
                    + "isOpen - " + myWindow1.isOpen);

            System.out.println("My window1: width - " + myWindow2.width + ", "
                    + " height - " + myWindow2.height + ", "
                    + " numberOfGlass - " + myWindow2.numberOfGlass + " ,"
                    + " color - " + myWindow2.color + ", "
                    + "isOpen - " + myWindow2.isOpen);

            System.out.println("My window1: width - " + myWindow3.width + ", "
                    + " height - " + myWindow3.height + ", "
                    + " numberOfGlass - " + myWindow3.numberOfGlass + " ,"
                    + " color - " + myWindow3.color + ", "
                    + "isOpen - " + myWindow3.isOpen);

            System.out.println("My window1: width - " + myWindow4.width + ", "
                    + " height - " + myWindow4.height + ", "
                    + " numberOfGlass - " + myWindow4.numberOfGlass + " ,"
                    + " color - " + myWindow4.color + ", "
                    + "isOpen - " + myWindow4.isOpen);

            System.out.println("My window1: width - " + myWindow5.width + ", "
                    + " height - " + myWindow5.height + ", "
                    + " numberOfGlass - " + myWindow5.numberOfGlass + " ,"
                    + " color - " + myWindow5.color + ", "
                    + "isOpen - " + myWindow5.isOpen);


        }

        // LabWork 2.3.2
        class MyWindow6 {
            private double width, height;

            public MyWindow MyWindow6() {
                this.width = 1.5;
                this.height = 1.3;
                MyWindow myWindow6 = new MyWindow();
                return myWindow6;
            }


        }


    }

    private static void printFilds() {
    }
}
