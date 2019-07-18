package LabWork221;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 1, 1},
        };

        int[][] b = new int[][]{
                new int[]{2, 2, 2},
                new int[]{2, 2, 2},
        };
        Matrix matrix = new Matrix();
        matrix.printMatrix(matrix.addition(a, b));
    }
}