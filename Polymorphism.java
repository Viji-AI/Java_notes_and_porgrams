class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Calculator {
    void add(int a, int b) {
        System.out.println("Int Sum = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Double Sum = " + (a + b));
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10.5, 20.5);
        Animal a = new Dog();
        a.sound();
    }
}