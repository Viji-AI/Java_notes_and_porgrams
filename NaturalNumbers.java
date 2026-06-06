public class NaturalNumbers {
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}

/*public class NaturalNumbers{
    public static void main(String[] args){
        int n =5;
        int sum = 0;
        for (int i=1; i <=n;i++){
            sum += i;
        }
            System.out.println("The sum of first n natural number is:" + sum);
        }
    }
*/ 