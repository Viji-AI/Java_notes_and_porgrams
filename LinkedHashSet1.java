import java.util.*;
public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Viji");
        set.add("Nanthu");
        set.add("Siva");
        System.out.println("LinkedHashSet of names: " + set);
        System.out.println("Size of the LinkedHashSet: " + set.size());
        System.out.println("Is the LinkedHashSet empty? " + set.isEmpty());
        set.remove("Nanthu");
        System.out.println("LinkedHashSet after removing Nanthu: " + set);
        System.out.println("Does the LinkedHashSet contain Siva? " + set.contains("Siva"));
    }
}
