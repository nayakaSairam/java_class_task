class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    public void displayBikeInfo() {
        displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 250, 4);
        Bike bike = new Bike("Yamaha", 150, true);

        car.displayCarInfo();
        bike.displayBikeInfo();
    }
}
