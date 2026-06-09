class Animal {
    String name;
    String sound;
    void setDetails(String n, String s) {
        name = n;
        sound = s;
    }
    void sound() {
        System.out.println(name + " says " + sound);
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setDetails("Dog", "Bark");

        Animal cat = new Animal();
        cat.setDetails("Cat", "Meow");

        dog.sound();
        cat.sound();
    }
}