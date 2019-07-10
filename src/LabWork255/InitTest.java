package LabWork255;

public class InitTest {

    private static int id;
    private static int nextId;

    {
        int nextId = (int) (100 * Math.random());


    }

    InitTest() {
        id = 1;
    }

    public static int getId() {
        return id;
    }

    public void nextId() {

        System.out.printf("Id: %d \n", id);
        System.out.println(nextId);
    }

    public void printId() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " , ");
        }



    }
}
