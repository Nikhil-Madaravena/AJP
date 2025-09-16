import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        System.out.println("Fruits in the list:");
        System.out.println(fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator it = fruits.iterator();
        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        fruits.remove("Cherry");
        System.out.println("After trying to remove Cherry (not in fruits):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Total fruits: " + fruits.size());

    }
}
