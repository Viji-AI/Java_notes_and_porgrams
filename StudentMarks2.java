public class StudentMarks2 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 90},
            {75, 85, 95, 88},
            {60, 70, 80}
        };
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}