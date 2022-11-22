import java.util.ArrayList;
import java.util.Arrays;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            E[] newsize = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newsize, 0, size);
            elements = newsize;
        }
    }


    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
    }

    public void add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i <size; i++) {
                elements[i] = elements[i+1];
        }
        size --;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        list.add(2, 99);
//        list.remove(3);
        System.out.println(list);

    }
}
