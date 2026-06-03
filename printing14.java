import java.util.Scanner;
public class printing14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the Student: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks of the Student: ");
        int marks = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}