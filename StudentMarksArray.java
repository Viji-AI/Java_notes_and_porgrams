public class StudentMarksArray {
    public static void main(String[] args) {
        int marks[] = {85, 90, 78, 88, 95};
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + " = " + marks[i]);
        }
    }
}