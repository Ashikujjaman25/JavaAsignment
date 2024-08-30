 package JavaAsignment;
// Base class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void honk() {
        System.out.println("Beep Beep!");
    }

    void displayInfo() {
        System.out.println("Vehicle Brand: " + this.brand);
    }
}

// Derived class
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    void honk() {
        System.out.println("Car horn: Honk Honk!");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Car Model: " + this.model);
    }
}

// Main class
public class prb_6 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.honk();
        myCar.displayInfo();
    }
}
