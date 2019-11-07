package LabWork22151_testrecflection1;

public class MyClass {
    private int a=1;
    protected int b=2;
    public int c=3;
    private int d=4;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public MyClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public MyClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public MyClass(int a) {
        this.a = a;
    }

    public MyClass() {

    }
}
