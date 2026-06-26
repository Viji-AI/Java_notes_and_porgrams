class Person {
    Person(String name) {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    Employee() {
        super("Rahul");
        System.out.println("Employee Constructor");
    }
}
public class SuperParameterized {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}