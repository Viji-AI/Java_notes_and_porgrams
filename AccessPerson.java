class Person {
    private String name = "Viji";
    public int age = 20;
    protected String address = "Chennai";
    public String getName() {
        return name;
    }
}
public class AccessPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.getName()); // Access through method
        System.out.println("Age: " + person.age);        // Public
        System.out.println("Address: " + person.address);// Protected
    }
}