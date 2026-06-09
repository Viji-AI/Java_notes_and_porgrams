import java.util.Scanner;
class Teacher {
    String name;
    String subject;
    void SetDetails(String n, String s) {
        name = n;
        subject = s;
    }
    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
public class TeacherMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Teacher Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Teacher t = new Teacher();
        t.SetDetails(name, subject);
        t.displayDetails();
    }
}