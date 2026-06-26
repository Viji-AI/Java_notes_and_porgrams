class Bank {
    final double INTEREST = 7.5;
    void calculateInterest(double amount) {
        double interest = (amount * INTEREST) / 100;
        System.out.println("Amount: " + amount);
        System.out.println("Interest Rate: " + INTEREST + "%");
        System.out.println("Interest: " + interest);
    }
}
public class FinalVariable {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.calculateInterest(10000);
    }
}