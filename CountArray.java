import java.util.Scanner;
public class CountArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int n : arr) {
            if(n % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even Count = " + count);
    }
}