package LabWork2144.TestGenerics3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {

    T[] ar;

    public MyMixer(T[] ar) {
        this.ar = ar;
    }


    public  <T> T[] shuffle(T[] ar) {
       Random rnd = new Random();
        for (int i = ar.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            T a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        System.out.println(Arrays.toString(ar));

        return ar;
    }

}


