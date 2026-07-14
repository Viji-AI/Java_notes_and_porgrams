import java.util.Scanner;
class InvalidPinException extends Exception {
    InvalidPinException(String msg) {
        super(msg);
    }
}
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}
class InputMismatchException extends Exception {
    InputMismatchException(String msg) {
        super(msg);
    }
}
class ArithmeticException extends Exception {
    ArithmeticException(String msg) {
        super(msg);
    }
}
public class ATMSimulation {
    static void validate(int pin, int balance, int amount)
            throws InvalidPinException,InsufficientBalanceException,InvalidAmountException,InputMismatchException,ArithmeticException {
        if (pin != 1234)
            throw new InvalidPinException("Invalid PIN");
        if (amount <= 0)
            throw new InputMismatchException("Enter a valid amount");
        if (amount < 100 || amount % 100 != 0)
            throw new InvalidAmountException("Amount should be at least 100 and multiple of 100");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        if (balance - amount < 500)
            throw new ArithmeticException("Minimum balance of Rs.500 should be maintained");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Simulation");
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        try {
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                validate(pin, balance, 100);   // Dummy amount for validation
                System.out.println("Current Balance = " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter Amount: ");
                int amount = sc.nextInt();
                validate(pin, balance, amount);
                balance = balance - amount;

                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = " + balance);
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
        catch (InvalidPinException |InvalidAmountException |InsufficientBalanceException |InputMismatchException |ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}