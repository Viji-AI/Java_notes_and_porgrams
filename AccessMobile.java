class MobilePhone {
    private String model;
    private double price;
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
}
public class AccessMobile{
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setModel("Samsung Galaxy S25");
        phone.setPrice(79999);
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: " + phone.getPrice());
    }
}