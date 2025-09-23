import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue before poll: " + queue);
        System.out.println("poll => " + queue.poll());
        System.out.println("poll => " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        System.out.println("Element at front of the queue is => " + queue.peek());
        System.out.println("Is the queue empty? Ans: " + queue.isEmpty());
        System.out.println("Size of the queue is => " + queue.size());
    }
}
