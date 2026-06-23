interface Person {
    void details();
}
class Employee implements Person {
    public void details() {
        System.out.println("Employee Details");
    }
}
class Trainer implements Person {
    public void details() {
        System.out.println("Trainer trains the interns.");
    }
}
class Intern extends Employee {
    void work() {
        System.out.println("Intern works on projects");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Intern i = new Intern();
        i.details();
        i.work();
    }
}