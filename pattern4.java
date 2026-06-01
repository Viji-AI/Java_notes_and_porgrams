public class pattern4 {
    public static void main(String[] args) {
        for(int i=1;i <=5;i++){
            char sum='A';
            for(int j=1; j<= i;j++){
                System.out.print(sum + "\t");
                sum++;
            }
            System.out.println();
        }
    }
}


