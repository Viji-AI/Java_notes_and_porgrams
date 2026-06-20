import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Positive Numbers:");
        for(int n : arr) {
            if(n > 0) {
                System.out.print(n + " ");
            }
        }
    }
}