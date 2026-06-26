class Person {
    Person() {
        System.out.println("Parent Constructor");
    }
}
class Employee extends Person {
    Employee() {
        System.out.println("Child Constructor");
    }
}
public class WithoutSuper {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}