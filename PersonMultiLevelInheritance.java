class Person {
    void person() {
        System.out.println("This is a person");
    }
}

class Employee extends Person {
    void employee() {
        System.out.println("A person can be an employee.");
    }
}

class Manager extends Employee {
    void manager() {
        System.out.println("An employee can be a manager.");
    }
}

public class PersonMultiLevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.person();
        m.employee();
        m.manager();
    }
}