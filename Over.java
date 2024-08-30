package JavaAsignment;
 //problem 7 override overloading
 
class Animal {
    void sound() { System.out.println("Some sound"); } // Base method (Overriding example)
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Woof Woof!"); } // Overriding method
}

class Calculator {
    int add(int a, int b) { return a + b; }             // Overloading with two parameters
    int add(int a, int b, int c) { return a + b + c; }  // Overloading with three parameters
}

public class Over {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        myAnimal.sound();  // Output: Some sound
        myDog.sound();     // Output: Woof Woof!

        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // Output: 5 (Overloaded method with 2 params)
        System.out.println(calc.add(2, 3, 4));      // Output: 9 (Overloaded method with 3 params)
    }
}

 