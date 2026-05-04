package day17;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        // Lambda Expression
        Calculator casio = () -> {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number 1:");
            int n1 = sc.nextInt();

            System.out.println("Enter number 2:");
            int n2 = sc.nextInt();

            int add = n1 + n2;

            System.out.println(n1 + " + " + n2 + " = " + add);

            sc.close(); // good practice
        };

        casio.sum();

        // Anonymous Class
        Calculator calculator = new Calculator() {

            @Override
            public void sum() {
                System.out.println("Adding");
            }

            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };

        calculator.sum();
        calculator.hello();
    }
}