package org.example;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) throws InvalidInputException {
        if (b > a) {
            throw new InvalidInputException("Number 1 should be greater than Number 2");
        }
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not possible.");
            return 0;
        }
    }

    public static double sqrt(double a) throws InvalidInputException {
        if (a < 0) {
            throw new InvalidInputException("Parameter must not be negative.");
        }
        return Math.sqrt(a);
    }
}
