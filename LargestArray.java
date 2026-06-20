import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int n : arr) {
            if(n > max) {
                max = n;
            }
        }
        System.out.println("Largest = " + max);
    }
}