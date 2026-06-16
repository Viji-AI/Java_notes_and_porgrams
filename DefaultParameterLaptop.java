class Laptop{
    String company;
    int cost;
    Laptop(){
        company = "Dell";
        cost = 50000;
    }
    void display(){
        System.out.println(company + " " + cost);
    }
}
public class DefaultParameterLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.display();
    }
}
