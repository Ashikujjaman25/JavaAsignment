 package JavaAsignment;

// Base class for method overriding
class Shape {
    void area() { System.out.println("Calculating area of a shape"); } // Base method
}

class Circle extends Shape {
    @Override
    void area() { System.out.println("Area of Circle = π * r^2"); } // Overriding method
}

class Rectangle extends Shape {
    @Override
    void area() { System.out.println("Area of Rectangle = length * width"); } // Overriding method
}

// Class demonstrating method overloading
class MathUtils {
    double power(int base, int exponent) { return Math.pow(base, exponent); }             // Overloading with int parameters
    double power(double base, int exponent) { return Math.pow(base, exponent); }          // Overloading with double base
    double power(int base, double exponent) { return Math.pow(base, exponent); }          // Overloading with double exponent
}

public class Over {
    public static void main(String[] args) {
        // Overriding example
        Shape myShape = new Shape();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();
        myShape.area();      // Output: Calculating area of a shape
        myCircle.area();     // Output: Area of Circle = π * r^2
        myRectangle.area();  // Output: Area of Rectangle = length * width

        // Overloading example
        MathUtils math = new MathUtils();
        System.out.println(math.power(2, 3));           // Output: 8.0 (Overloaded method with int params)
        System.out.println(math.power(2.5, 3));         // Output: 15.625 (Overloaded method with double base)
        System.out.println(math.power(2, 2.5));         // Output: 5.656854249492381 (Overloaded method with double exponent)
    }
}
