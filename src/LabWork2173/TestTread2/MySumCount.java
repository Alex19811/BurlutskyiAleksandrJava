package LabWork2173.TestTread2;

public class MySumCount extends Thread {

    private int startIndex;
    private int stopIndex;
    private int[] arr;
    private long resultSum;

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run(){
        for (int i = startIndex; i <= stopIndex; i++){
            resultSum = resultSum + arr[i];
        }
    }
}