public class TypesVariables {
    // Static variable
    static String college = "MSU";
    // Instance variable
    String name = "Vijayalakshmi";
    // Void method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        TypesVariables obj = new TypesVariables();
        obj.display();
    }
}