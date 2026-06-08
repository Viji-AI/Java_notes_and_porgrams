public class SumGreaterThan50 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; ; i++) {
            sum += i;
            if(sum > 50)
                break;
            System.out.print(i + " ");
        }
    }
}