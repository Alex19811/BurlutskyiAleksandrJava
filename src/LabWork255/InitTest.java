package LabWork255;

public class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int) (1000 * Math.random());
    }

    public InitTest() {
        this.id = nextId;
        this.nextId = ++nextId;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }

}
