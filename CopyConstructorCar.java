class Car{
    String model;
    String price;
    Car(String m, String p){
        model = m;
        price = p;
    }
    Car(Car c){
        this.model = c.model;
        this.price = c.price;
    }
    void display(){
        System.out.println(model + " - " + price);
    }
}
public class CopyConstructorCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "250000");
        Car car2 = new Car(car1);
        car2.price = "280000";
        car1.display();
        car2.display();
    }
}
