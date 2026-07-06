class Calculator {
    void add(int a, int b) {
        System.out.println("Int Addition = " + (a + b));
    }
    void add(float a, float b) {
        System.out.println("Float Addition = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Double Addition = " + (a + b));
    }
}
public class Calculator2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10.5f, 20.5f);
        c.add(10.55, 20.45);
    }
}