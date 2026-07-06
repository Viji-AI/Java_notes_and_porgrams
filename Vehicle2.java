class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
}
public class Vehicle2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}