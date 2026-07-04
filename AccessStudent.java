class Student {
    private int marks = 95;
    public int getMarks() {
        return marks;
    }
}
public class AccessStudent {
    public static void main(String[] args) {
        Student s = new Student();
        // System.out.println(s.marks);   //marks has private access in Student class
        System.out.println("Marks: " + s.getMarks());
    }
}