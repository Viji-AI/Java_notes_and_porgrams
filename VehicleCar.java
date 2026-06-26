class Vehicle {
    String brand = "Toyota";
    Vehicle() {
        System.out.println("Vehicle Constructor");
    }
    void display() {
        System.out.println("Vehicle Method");
    }
}
class Car extends Vehicle {
    String brand = "Fortuner";
    Car() {
        super();
    }
    void show() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Vehicle Brand: " + super.brand);
        super.display();
    }
}
public class VehicleCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}