/*public class Factorial {
    public static void main(String[] args){
        int n =5;
        int factorial = 1;
        for(int i =1; i<=n; i++){
            factorial *=i;
        }
        System.out.println("The Factorial of " + n +" is " + factorial);
    }
}
*/
public class Factorial{
    public static void main(String[] args){
        int i = 5;
        int num = i;
        int factorial = 1;
        while( i > 0){
            factorial *=i;
            i--;
        }
        System.out.println("The Factorial of " + num +" is " + factorial);
    }
}
    
