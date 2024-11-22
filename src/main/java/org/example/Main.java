package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number (double): ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0.0;

        switch (operation) {
            case '+':
                result = Calculator.add(num1, num2);
                break;
            case '-':
                try {
                    result = Calculator.subtract(num1, num2);
                    break;
                } catch (InvalidInputException e) {
                    System.out.println("Number 1 should be greater than Number 2");
                    break;
                }
            case '*':
                result = Calculator.multiply(num1, num2);
                break;
            case '/':
                result = Calculator.divide(num1, num2);
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();

    }
}