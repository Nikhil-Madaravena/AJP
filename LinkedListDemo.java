import java.util.LinkedList;
import java.util.Iterator;
import java.util.Random;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            ll1.add(new Random().nextInt(100));
        }
        System.out.println("LinkedList 1: " + ll1);
        System.out.println("getFirst(): " + ll1.getFirst());
        System.out.println("Linked List :" + ll1);
        System.out.println("removeFirst(): " + ll1.removeFirst());
        System.out.println("Linked List :" + ll1);
        ll1.addLast(100);
        System.out.println("After adding 100 at last: " + ll1);
        ll1.addFirst(200);
        System.out.println("After adding 200 at first: " + ll1);
        System.out.println("get(3): " + ll1.get(3));
        System.out.println("peek(): " + ll1.peek());
        System.out.println("Linked List :" + ll1);
        System.out.println("element(): " + ll1.element());
        System.out.println("Linked List :" + ll1);
        System.out.println("poll(): " + ll1.poll());
        System.out.println("Linked List :" + ll1);
        System.out.println("remove(): " + ll1.remove());
        System.out.println("Linked List :" + ll1);
        ll1.push(150);
        System.out.println("After pushing 150: " + ll1);
        System.out.println("pop(): " + ll1.pop());
        System.out.println("Linked List :" + ll1);
        System.out.println("LL displayed using Iterator:");

        Iterator it = ll1.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
