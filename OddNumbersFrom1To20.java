public class OddNumbersFrom1To20 {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++) {
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}