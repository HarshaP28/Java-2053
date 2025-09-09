# Write a program to add,substract, divide, and multiply for complex numbers and method overloading and method overriding and inheritence

// Parent class
class ComplexNumber {
    double real;
    double imag;

    // Constructor
    ComplexNumber(double r, double i) {
        real = r;
        imag = i;
    }

    // Method to display
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    // Method Overloading: add with complex number
    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real, imag + c.imag);
    }

    // Method Overloading: add with real number only
    public ComplexNumber add(double r) {
        return new ComplexNumber(real + r, imag);
    }
}

// Child class (Inheritance)
class AdvancedComplexNumber extends ComplexNumber {

    // Constructor calls parent constructor
    AdvancedComplexNumber(double r, double i) {
        super(r, i);
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(real - c.real, imag - c.imag);
    }

    // Multiplication
    public ComplexNumber multiply(ComplexNumber c) {
        double r = (real * c.real) - (imag * c.imag);
        double i = (real * c.imag) + (imag * c.real);
        return new ComplexNumber(r, i);
    }

    // Division
    public ComplexNumber divide(ComplexNumber c) {
        double denominator = (c.real * c.real + c.imag * c.imag);
        double r = (real * c.real + imag * c.imag) / denominator;
        double i = (imag * c.real - real * c.imag) / denominator;
        return new ComplexNumber(r, i);
    }

    // Method Overriding (changing display)
    @Override
    public void display() {
        System.out.println("Complex: " + real + " + " + imag + "i");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create complex numbers
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        // Using child class
        AdvancedComplexNumber ac1 = new AdvancedComplexNumber(4, 5);
        AdvancedComplexNumber ac2 = new AdvancedComplexNumber(2, 3);

        // Addition
        ComplexNumber sum = ac1.add(ac2);     // with complex number
        ComplexNumber sumReal = ac1.add(10);  // with real number

        // Subtraction
        ComplexNumber diff = ac1.subtract(ac2);

        // Multiplication
        ComplexNumber prod = ac1.multiply(ac2);

        // Division
        ComplexNumber div = ac1.divide(ac2);

        // Display results
        System.out.print("Addition: "); sum.display();
        System.out.print("Addition with real: "); sumReal.display();
        System.out.print("Subtraction: "); diff.display();
        System.out.print("Multiplication: "); prod.display();
        System.out.print("Division: "); div.display();

        // Demonstrating Overriding
        ac1.display(); // Calls overridden display method
    }
}


Output:
Addition: 6.0 + 8.0i
Addition with real: 14.0 + 5.0i
Subtraction: 2.0 + 2.0i
Multiplication: -7.0 + 22.0i
Division: 1.7692307692307692 + -0.15384615384615385i
Complex: 4.0 + 5.0i
  
