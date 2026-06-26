class School {
    void message() {
        System.out.println("Welcome to School");
    }
}
class Student extends School {
    void message() {
        System.out.println("Welcome Student");
        super.message();
    }
}
public class SuperMethodOverride {
    public static void main(String[] args) {
        Student s = new Student();
        s.message();
    }
}