import java.util.Scanner;
class Employee {
    String name;
    int salary;
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        e.display();
    }
}