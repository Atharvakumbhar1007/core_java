package day13.polymorphism;

// Method Overloading -> Compile Time Polymorphism
public class Calculator {

    public void addition(int n1, int n2) {
        System.out.println("Addition of 2 integers = " + (n1 + n2));
    }

    public void addition(double n1, int n2) {
        System.out.println("Addition of decimal and integer = " + (n1 + n2));
    }

    public void addition(int n1, int n2, int n3) {
        System.out.println("Addition of 3 integers = " + (n1 + n2 + n3));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addition(5, 6);
        calculator.addition(25, 5, 1);
        calculator.addition(0.2, 9);
    }
}

class MainClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addition(5, 6);
        calculator.addition(25, 5, 1);
        calculator.addition(0.2, 9);
    }
}