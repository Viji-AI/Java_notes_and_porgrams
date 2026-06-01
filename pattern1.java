public class pattern1 {
    public static void main(String[] args) {
        int sum=2;
        for(int i=1;i <=3;i++){
            for(int j=1; j<= 3;j++){
                System.out.print(sum + "\t");
                sum+=2;
            }
            System.out.println();
        }
    }
}
