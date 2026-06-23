interface Printer{
    void print();
}
interface Scanner{
    void scan();
}
class MultiFunction implements Printer, Scanner{
    public void print(){
        System.out.println("Printing document...");
    }
    public void scan(){
        System.out.println("Scanning document...");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        MultiFunction mf = new MultiFunction();
        mf.print();
        mf.scan();
    }
}
