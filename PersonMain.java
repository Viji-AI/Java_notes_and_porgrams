import java.util.Scanner;
class Person{
    String Name;
    int Age;
    String City;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Age: ");
        Age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter City: ");
        City = sc.nextLine();
    }
    void Show() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("City: " + City);
    }
}
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.getDetails();
        person1.Show();
    }
}
   
