abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }
    int noOfWheels() {
        return 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Car Fuel Type: " + v1.fuelType());
        System.out.println("Car Wheels: " + v1.noOfWheels());

        System.out.println("Bike Fuel Type: " + v2.fuelType());
        System.out.println("Bike Wheels: " + v2.noOfWheels());
    }
}
