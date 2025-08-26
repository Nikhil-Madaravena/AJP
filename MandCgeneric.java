class Gen<T> {
    T obj;
    Gen(T o) { 
        obj = o;
    }
    void disp() {
        System.out.println(obj);
    }
    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}

public class MandCgeneric {
    public static void main(String[] args) {
        Gen<Double> dobj = new Gen<>(98.6);
        dobj.disp();
        dobj.showType();
    }
}
