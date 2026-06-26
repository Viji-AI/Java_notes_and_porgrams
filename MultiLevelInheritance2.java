class Grandparent {
    void grandparent() {
        System.out.println("This is Grandparent");
    }
}
class Parent extends Grandparent {
    void parent() {
        System.out.println("This is Parent");
    }
}
class Child extends Parent {
    void child() {
        System.out.println("This is Child");
    }
}
public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.grandparent();
        c.parent();
        c.child();
    }
}