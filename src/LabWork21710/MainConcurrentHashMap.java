package LabWork21710;

public class MainConcurrentHashMap {

    public static void main(String[] args) {

        Storage storage = new Storage();

        Write write = new Write(storage);
        Read read = new Read(storage);

        read.start();
        write.start();
    }
}
