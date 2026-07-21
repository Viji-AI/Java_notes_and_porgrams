import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q); // Output: 1
        System.out.println(q.poll()); // Output: 2
        System.out.println(q); // Output: 3
    }
}
