package LabWork2144.TestGenerics3;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arr2 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        MyMixer<Integer> myMixer = new MyMixer<>(arr1);
        MyMixer<String> myMixer1 = new MyMixer<>(arr2);

myMixer.shuffle(arr1);
myMixer1.shuffle(arr2);

            }
}
