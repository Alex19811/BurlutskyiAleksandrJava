package LabWork253;

public class MyInit {


    int[] arr = new int[10];


    public MyInit() {

        arr[0] = (int) (100 * Math.random());
        arr[1] = (int) (100 * Math.random());
        arr[2] = (int) (100 * Math.random());
        arr[3] = (int) (100 * Math.random());
        arr[4] = (int) (100 * Math.random());
        arr[5] = (int) (100 * Math.random());
        arr[6] = (int) (100 * Math.random());
        arr[7] = (int) (100 * Math.random());
        arr[8] = (int) (100 * Math.random());
        arr[9] = (int) (100 * Math.random());
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }

    }

}

