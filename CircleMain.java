import java.util.Scanner;
class Circle {
    int radius;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextInt();
    }
    void CalculateArea() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }    }

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getData();
        c.CalculateArea();
    }
}