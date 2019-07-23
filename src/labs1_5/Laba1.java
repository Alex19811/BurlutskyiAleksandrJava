package labs1_5;

import java.util.Date;
import java.util.Random;

public class Laba1 {

    public static void main(String[] args) {
        Car car = new Car("x5");
        car.date = new Date();
        car.maxSpeed = 200;

        System.out.println(car.toString());
    }
}
