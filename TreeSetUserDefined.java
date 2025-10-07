import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    double marks;

    Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student st) {
        return this.rollno - st.rollno;
    }

    public String toString() {
        return this.rollno + " - " + this.name + " - " + this.marks;
    }
}

public class TreeSetUserDefined {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student(101, "Alice", 85.5));
        ts.add(new Student(102, "Bob", 90.0));
        ts.add(new Student(103, "Charlie", 78.0));
        ts.add(new Student(104, "David", 88.5));

        System.out.println("Students in TreeSet sorted by roll number:");
        for (Student st : ts) {
            System.out.println(st);
        }
    }
}