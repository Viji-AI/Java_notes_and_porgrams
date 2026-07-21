import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        ListIterator<String> it = list.listIterator();
        System.out.println("Forward direction:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Backward direction:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
