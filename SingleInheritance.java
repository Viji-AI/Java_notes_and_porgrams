class Child {
    void eat(){
        System.out.println("Children Can Eat...");
    }
}
class Girl extends Child {
    void tone(){
        System.out.println("Girls are understanding...");
    }   
}
public class SingleInheritance {
    public static void main(String[] args) {
        Girl g = new Girl();
        g.eat();
        g.tone();
    }
}