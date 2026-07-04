class BankAccount {
    private double balance = 1000;
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class AccessBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        account.withdraw(700);
        System.out.println("Current Balance: " + account.getBalance());
    }
}