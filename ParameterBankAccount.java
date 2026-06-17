class BankAccount {
    String name;
    int accountNumber;

    BankAccount(String n, int accNo) {
        name = n;
        accountNumber = accNo;
    }
    void display() {
        System.out.println(name + " " + accountNumber);
    }
}
public class ParameterBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Viji", 12345);
        BankAccount account2 = new BankAccount("Nanthu", 67890);
        account1.display();
        account2.display();
    }
}
