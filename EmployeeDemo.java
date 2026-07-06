class Employee {
    void display() {
        System.out.println("Employee Details");
    }
    void display(String name) {
        System.out.println("Employee Name: " + name);
    }
    void display(String name, int id) {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        e.display("Viji");
        e.display("Viji", 101);
    }
}