class Ohnoo extends Exception {
    Ohnoo(String msg) {
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            throw new Ohnoo("Custom Exception");
        } catch (Ohnoo e) {
            System.out.println(e.getMessage());
        }
    }
}   