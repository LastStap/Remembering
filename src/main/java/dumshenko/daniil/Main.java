package dumshenko.daniil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> listOfCars = new ArrayList<>();

        Car car1 = new Car(2023, 1.8);
        Car car2 = new Car(2022, 1.6);
        Car car3 = new Car(2024, 2.0);
        Car car4 = new Car(1986, 12.0);

        listOfCars.add(car1);
        listOfCars.add(car4);
        listOfCars.add(car2);
        listOfCars.add(car3);

        System.out.println("Before Sorting : " + listOfCars.toString());
        Collections.sort(listOfCars);
        System.out.println("After Sorting : " + listOfCars.toString());

        TreeSet<Car> treeSetOfCars = new TreeSet<>(new CarEngineCapacityComparator());
        treeSetOfCars.addAll(listOfCars);

        System.out.println("TreeSet sorted by engine capacity: " + treeSetOfCars);
    }
}
