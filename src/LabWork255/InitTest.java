package LabWork255;

public class InitTest {


    private int id;
    private static int nextId;

    {
        nextId = (int) (100 * Math.random());
        System.out.println(nextId);
    }

    //инициализация поля id из nextId увеличивается каждый раз, когда создается новый экземпляр InitTest

    InitTest() {
       // id = nextId+;
        System.out.println(id);
    }






   /* public static int getId() {
       System.out.print(id);
        return getId();
    }*/
}



    /*public void nextId() {

        System.out.printf("Id: %d \n", id);
        System.out.println(nextId);
    }

    public void printId() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " , ");
        }



    }
*/
