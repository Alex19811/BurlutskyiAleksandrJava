package Labwork261.Exemple.applepack;

public class Apple {
    double weight;

    {weight=0.1;}

    public double getWeight() {

        System.out.println("Apple weight" + " " +weight+ " " +"kg");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
