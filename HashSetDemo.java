import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            hs1.add(rand.nextInt(100)+1);
        }
        System.out.println("HashSet 1: " + hs1);
        System.out.println("Size of HashSet 1: " + hs1.size());
        System.out.println("HashSet 1 using Iterator:");
        Iterator it = hs1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Hashset 1 contains 0? " + hs1.contains(0));
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.addAll(hs2);
        System.out.println("HashSet 2 (copy of HashSet 1): " + hs2);
        System.out.println("HashSet 2 after invoking clear():");
        hs2.clear();
        for(Integer i : hs2) {
            System.out.println(i);
        }
    }
}
