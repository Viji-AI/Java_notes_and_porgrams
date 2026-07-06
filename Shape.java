class Shapes {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shapes {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shapes {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Triangle extends Shapes {

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class Shape {
    public static void main(String[] args) {
        Shapes s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}