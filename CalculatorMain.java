import java.util.Scanner;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return  a / b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition = " + c.add(a, b));
        System.out.println("Subtraction = " + c.subtract(a, b));
        System.out.println("Multiplication = " + c.multiply(a, b));
        System.out.println("Division = " + c.divide(a, b));
    }
}