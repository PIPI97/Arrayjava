import java.lang.reflect.Array;
import java.util.Arrays;

public class concatarrray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        int[] newarray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newarray[i] = array1[i];
        }
        for (int i = array1.length; i < newarray.length; i++) {
            newarray[i] = array2[i - array2.length];
        }
        System.out.println("newarray: " + Arrays.toString(newarray));
    }
}
