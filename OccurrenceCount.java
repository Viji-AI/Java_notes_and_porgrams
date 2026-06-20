import java.util.Scanner;

public class OccurrenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        for(int n : arr) {
            if(n == key) {
                count++;
            }
        }

        System.out.println("Occurrences = " + count);
    }
}