package LiveCode;

// Base class
class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void start() {
        System.out.println("The " + color + " " + brand + " starts.");
    }
    public void stop() {
        System.out.println("The " + color + " " + brand + " stops.");
    }
    public String getBrand( ) {
        return brand;
    }
    public void setBrand( String brand ) {
        this.brand = brand;
    }
    public String getColor( ) {
        return color;
    }
    public void setColor( String color ) {
        this.color = color;
    }
}

// Derived class
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    public void drive() {
        System.out.println("The " + getColor() + " " + getBrand() + " with " + numDoors + " doors is driving.");
    }
}

// Derived class
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String color, boolean hasSidecar) {
        super(brand, color);
        this.hasSidecar = hasSidecar;
    }

    public void ride() {
        if (hasSidecar) {
            System.out.println("The " + getColor() + " " + getBrand() + " motorcycle with a sidecar is riding.");
        } else {
            System.out.println("The " + getColor() + " " + getBrand() + " motorcycle is riding.");
        }
    }
}



public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 4);
        car.start();
        car.drive();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Black", true);
        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
    }

}
