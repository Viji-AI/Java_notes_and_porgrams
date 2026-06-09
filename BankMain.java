import java.util.Scanner;
class BankAccount {
    int balance;
    void getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextInt();
    }
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        balance -= amount;
    }
    void display() {
        System.out.println("Final Balance = " + balance);
    }
}
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.getBalance();
        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();
        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();
        b.deposit(deposit);
        b.withdraw(withdraw);
        b.display();
    }
}