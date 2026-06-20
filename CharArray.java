import java.util.Scanner;
public class CharArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for(char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}