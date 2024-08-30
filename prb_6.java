 
package JavaAsignment;
// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound.");
    }

    void displayInfo() {
        System.out.println("Animal Name: " + this.name);
    }
}

// Derived class
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Dog Breed: " + this.breed);
    }
}

// Main class
public class prb_6 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.makeSound();
        myDog.displayInfo();
    }
}