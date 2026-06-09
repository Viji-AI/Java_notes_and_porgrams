class Car{
    String Brand;
    String Model;
    double Price;
    void displayDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Price: " + Price);
    }
}
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.Brand = "Toyota";
        car1.Model = "Corolla";
        car1.Price = 24000.00;
        car1.displayDetails();

        Car car2 = new Car();
        car2.Brand = "Honda";   
        car2.Model = "CR-V";
        car2.Price = 22000.00;
        car2.displayDetails();
    }
}
