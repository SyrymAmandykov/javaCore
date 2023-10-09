package StreamApiExOne;
import java.util.*;
import java.util.stream.Collectors;

public class CarCity {
    List<Car> cars = new ArrayList<>();

    public CarCity(){
    }

    public CarCity(List<Car> cars){
        this.cars = cars;
    }

    void addCar(Car car) {
        cars.add(car);
    }

    public Car firstGreatVolumeCar() {
        return cars.stream()
                .filter(index -> index.getEngineVolume() > 3.0)
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Car> search(String name){
        return (ArrayList<Car>) cars.stream()
                .filter(index -> index.getName().equals(name))
                .collect(Collectors.toList());
    }

    public ArrayList<Car> filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume){
        return (ArrayList<Car>) cars.stream()
                .filter(index -> index.getMaxSpeed() > fromSpeed && index.getMaxSpeed() <= toSpeed)
                .filter(index -> index.getEngineVolume() > fromVolume && index.getEngineVolume() <= toVolume)
                .collect(Collectors.toList());
    }
}
