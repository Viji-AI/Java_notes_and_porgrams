import java.util.Scanner;
public class printing15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
        System.out.print("Enter fifth number: ");
        int num5 = sc.nextInt();
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("Average = " + avg);
    }
}