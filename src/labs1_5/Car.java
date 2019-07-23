package labs1_5;

import java.util.Date;

public class Car {
    public String model = "x5";
    public Date date;
    public int maxSpeed;

    public Car(String model) {
        this.model = model  ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", date=" + date +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
