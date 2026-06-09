import java.util.Scanner;
class Book{
    String Title;
    String Author;
    double Price;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        Title = sc.nextLine();
        System.out.print("Enter Author: ");
        Author = sc.nextLine();
        System.out.print("Enter Price: ");
        Price = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
    }
}
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.getDetails();
        book1.displayDetails();
    }
}
