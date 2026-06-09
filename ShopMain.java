import java.util.Scanner;

class ShopItem {
    String itemName;
    int quantity;
    double price;

    void setDetails(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    void calculateCost() {
        double total = quantity * price;

        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + total);
    }
}

public class ShopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        ShopItem item = new ShopItem();
        item.setDetails(name, qty, price);
        item.calculateCost();
    }
}