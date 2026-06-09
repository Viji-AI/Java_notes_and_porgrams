import java.util.Scanner;

class Mobile{
    String Brand;
    double Price;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        Brand = sc.nextLine();
        System.out.print("Enter Price: ");
        Price = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + Price);
    }
}
public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.getDetails();
        mobile1.displayDetails();
        Mobile mobile2 = new Mobile();
        mobile2.getDetails();
        mobile2.displayDetails();
    }
}
   
