package LabWork234;

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;

    public MyWindow(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        setWidth(width);
        setHeight (height);
        setNumberOfGlass(numberOfGlass);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }
}
