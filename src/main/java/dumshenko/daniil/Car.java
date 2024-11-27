package dumshenko.daniil;

public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(getYearOfManufacture(), otherCar.getYearOfManufacture());
    }

    @Override
    public String toString() {
        return "Car{yearOfManufacture = " + yearOfManufacture + ", engineCapacity = " + engineCapacity + "}";
    }
}
