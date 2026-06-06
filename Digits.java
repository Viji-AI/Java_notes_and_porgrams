public class Digits {
    public static void main(String[] arg){
        int n = 123;
        int num = n;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            System.out.println("The digits of " + num + " are: " + d);
        }
    }
}
