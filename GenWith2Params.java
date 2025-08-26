class Gen2<T, V> {
    T ob1;
    V ob2;
    
    Gen2(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    
    T getob1() {
        return ob1;
    }
    
    V getob2() {
        return ob2;
    }
    void showObj1Type() {
        System.out.println("Type of T is " + ob1.getClass().getName());
    }
    void showObj2Type() {
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
}

public class GenWith2Params {
    public static void main(String[] args) {
        Gen2<Integer, Double> obj = new Gen2<>(88, 99.99);
        System.out.println("Value of ob1: " + obj.getob1());
        System.out.println("Value of ob2: " + obj.getob2());
        obj.showObj1Type();
        obj.showObj2Type();
    }
}
