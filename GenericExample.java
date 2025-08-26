class DisplayValue<T> {
    private T t;

    public DisplayValue(T t) {
        this.t = t;
    }

    public void display() {
        System.out.println(t);
    }
}

public class GenericExample {
    public static void main(String[] args) {
        DisplayValue<Integer> iValue = new DisplayValue<>(123);
        iValue.display();

        DisplayValue<Double> dValue = new DisplayValue<>(45.67);
        dValue.display();  

        DisplayValue<String> sValue = new DisplayValue<>("Hello Generics");
        sValue.display();
    }
}
