public class TotalElements {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20},
            {30, 40, 50, 60},
            {70, 80, 90}
        };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i].length;
        }
        System.out.println("Total number of elements = " + count);
    }
}