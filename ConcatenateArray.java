import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];
        String result = "";

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for(String s : arr) {
            result += s;
        }

        System.out.println(result);
    }
}