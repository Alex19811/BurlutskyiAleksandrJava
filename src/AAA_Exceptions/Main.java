package AAA_Exceptions;

 class Main {
  /*   static String s= "";*/


     /*void go() {
         int x = 1;
         boolean b = true;
         assert (b);*/

    /* int getInt() {
         try {

             String[] stud = {"H", "P"};
             System.out.println(stud[5]);
         } catch (Exception e) {
             return 10;
         } finally {
             return 20;
         }
     }*/

         public static void main (String[]args) {
            /* try {
                 s += "1";
                 throw new Exception();
             } catch (Exception e) {
                 s += "2";
             } finally {
                 s += "3";
                 doSuff();
                 s += "4";
             }
             System.out.println(s);
         }
         static void doSuff(){
             int x=0;
             int y = 7/x;
*/
             /*try {
                String[][] names = {{"A", "M"}, null,{"P"}};
                System.out.println(names[2][1]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(1);
            }*/




        /*  try {
            myMethod();
        } catch (StackOverflowError s) {
            for (int i = 0; i < 2; i++)
                System.out.println(i);
        }
    }
    public static  void  myMethod() {myMethod();}*/

      /*  int j = 7;
        assert (++j > 7);
        assert (++j > 8) : "hi";
        assert (j > 10) : j = 12;
        assert (j == 12) : doStuff();
        assert (j == 12) : new Main();
    }
    static void doStuff(){*/


    /*String[] stud = {"Ser", "Jos"};
    try {
        System.out.println(stud[2]);

    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Exep");
    }
        System.out.println("All see");
    */
    boolean assertsOn = false;
        assert (assertsOn) : assertsOn = true;
        if(assertsOn){
            System.out.println("assert is on");
        }
         }
     }

