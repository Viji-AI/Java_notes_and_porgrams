import java.util.Scanner;
class StudentMarks {
    int m1, m2, m3;
    void setMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    void calculate() {
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
public class StudentMarksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        StudentMarks s = new StudentMarks();
        s.setMarks(m1, m2, m3);
        s.calculate();
    }
}