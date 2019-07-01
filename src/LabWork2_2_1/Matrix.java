package LabWork2_2_1;

import javax.xml.soap.SOAPPart;

public class Matrix {

    //-public int [][] multipliMatrices (int [][] a, int [][]b){
    // -reегкт
    // -}


    public int[][] addition(int[][] a, int[][] b) {
        if (inMatrixSuitable(a, b)) {
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++)  {

                for (int j=0; j < a[i].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;

        }
        return new int[1][1];
    }

    private boolean inMatrixSuitable(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        return true;
    }


    public void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++){
            for (int j=0; j <a [i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
