class A<T> {
    T a;

    A(T a) {
        this.a = a;
    }

    void showT() {
        System.out.println("a = " + a);
    }
}

class B<T, V> extends A<T> {
    V b;

    B(T a1, V b1) {
        super(a1);
        this.b = b1;
    }

    void showV() {
        super.showT();
        System.out.println("b = " + b);
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        B<Integer, Double> obj = new B<>(88, 99.99);
        obj.showV();
    }
}
