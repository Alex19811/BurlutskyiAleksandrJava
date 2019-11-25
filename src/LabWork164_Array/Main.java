package LabWork164_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,4,65,95,1,2,0,25,36,45,68,4,5,9,8,7};
        Arrays.sort(arr);
        int searchValue = 256;
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of searched value in sort array is: " + Arrays.binarySearch(arr, searchValue));
    }
}
