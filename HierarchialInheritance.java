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
class Boy extends Child {
    void tone(){
        System.out.println("Boys are naughty...");
    }   
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Girl g = new Girl();
        Boy b = new Boy();
        g.eat();
        g.tone();
        b.eat();
        b.tone();
    }
}