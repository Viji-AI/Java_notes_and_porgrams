class Person {
    void person() {
        System.out.println("This is a Person");
    }
}
class Employee extends Person {
    void employee() {
        System.out.println("Person can be an Employee");
    }
}
public class SingleInheritance2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.person();
        e.employee();
    }
}