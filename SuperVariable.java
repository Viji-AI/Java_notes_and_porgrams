class Person {
    String name = "Parent";
}
class Employee extends Person {
    String name = "Child";
    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);
    }
}
public class SuperVariable {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}