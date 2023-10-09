package StreamApiExOne;
import java.util.*;

import java.util.List;

public class test {
    public static void main(String[] args) {

        Car car1 = new Car("mers",220,2.0);
        Car car2 = new Car("golf",200,2.0);
        Car car4 = new Car("jeep",240,3.1);
        Car car5 = new Car("prado",240,4.0);
        Car car6 = new Car("surf",240,4.5);
        Car car3 = new Car("matiz",180,4.6);

        CarCity carcity = new CarCity();
        carcity.addCar(car1);
        carcity.addCar(car2);
        carcity.addCar(car3);
        carcity.addCar(car4);
        carcity.addCar(car5);
        carcity.addCar(car6);

//        System.out.println(carcity.firstGreatVolumeCar());
//        System.out.println(carcity.search("mers"));

        ArrayList<Car> Car =  carcity.filterCars(181,230,1.9,3.0);
        System.out.print(Car);

//        for (int i = 0; i < Car.size(); i++) {
//            System.out.println("Name: " + Car.get(i).getName() + " Max Speed: " + Car.get(i).getMaxSpeed() + " Engine Volume: " + Car.get(i).getEngineVolume());
//        }


    }
}
