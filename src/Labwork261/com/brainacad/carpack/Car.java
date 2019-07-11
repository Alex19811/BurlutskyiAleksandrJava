package Labwork261.com.brainacad.carpack;

public class Car {
    double weight;
    {weight=3000;}

    public double getWeight() {
        System.out.println("Car weight" + " " +weight+ " " +"kg");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
