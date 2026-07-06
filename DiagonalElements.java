public class DiagonalElements {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal Elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}