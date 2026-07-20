import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Viji");
        set.add("Nanthu");
        set.add("Siva");
        System.out.println("HashSet of names: " + set);
        System.out.println("Size of the HashSet: " + set.size());
        System.out.println("Is the HashSet empty? " + set.isEmpty());
        set.remove("Nanthu");
        System.out.println("HashSet after removing Nanthu: " + set);
        System.out.println("Does the HashSet contain Siva? " + set.contains("Siva"));
    }
}
