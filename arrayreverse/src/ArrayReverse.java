import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {

    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        Stack<Integer> teststack = new Stack<>();


        for (int i = 0; i < arr.length; i++) {
            teststack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(teststack.pop());
    }
}
