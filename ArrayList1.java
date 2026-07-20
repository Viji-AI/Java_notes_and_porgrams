import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Viji");
        list.add("Nanthu");
        list.add("Siva");
        System.out.println("List of names: " + list);
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        list.remove("Nanthu");
        System.out.println("List after removing Nanthu: " + list);
        list.set(1,"Nantha Kishore");
        System.out.println("List after replacing Siva with Nantha Kishore: " + list);
    }
}
