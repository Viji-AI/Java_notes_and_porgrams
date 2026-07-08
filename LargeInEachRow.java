import java.util.Scanner;
public class LargeInEachRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements for Row " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println("Largest in Row " + (i + 1) + " = " + max);
        }
    }
}