package DataStructures.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Harold"));
    }
}
