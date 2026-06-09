import java.util.Scanner;
class Laptop{
    String Brand;
    String Ram;
    double Price;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        Brand = sc.nextLine();
        System.out.print("Enter RAM: ");
        Ram = sc.nextLine();
        System.out.print("Enter Price: ");
        Price = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("RAM: " + Ram);
        System.out.println("Price: " + Price);
    }
}
public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.getDetails();
        laptop1.displayDetails();

    }
}
