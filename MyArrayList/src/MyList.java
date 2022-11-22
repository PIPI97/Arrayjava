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

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
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

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }

    public void clear() {
        elements = new Object[0];
        size = 0;
    }

    public E get(int i) {
        checkIndex(i);
        return (E) elements[i];
    }


    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
