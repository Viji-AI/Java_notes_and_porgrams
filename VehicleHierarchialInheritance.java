class Vehicle {
    void vehicle(){
        System.out.println("Vehicle is for Driving...");
    }
}
class Car extends Vehicle {
    void car(){
        System.out.println("Car is a type of vehicle...");
    }   
}
class Bike extends Vehicle {
    void bike(){
        System.out.println("Bike is a type of vehicle...");
    }   
}
public class VehicleHierarchialInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.vehicle();
        c.car();
        b.vehicle();
        b.bike();
    }
}