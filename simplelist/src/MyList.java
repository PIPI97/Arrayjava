import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 15;
    private Object elements[];

    public Object[] getElements() {
        return elements;
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

        public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
//    public static void main(String[] args) {
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(1);
//        test.add(2);
//        test.add(3);
//        test.add(4);
//        System.out.println(Arrays.toString(test.toArray()));
//    }
}
