import java.util.Arrays;

public class two_dimension {
    public static void main(String[] args) {
        int[][] twodi = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        for (int []n:twodi ) {
            System.out.println(Arrays.toString(n));
        }
        int max = twodi[0][0];
        for (int[] n : twodi) {
            for (int m : n) {
                if (m > max) {
                    max = m;
                }
            }
        }System.out.println("Max is: " + max);
    }
}
