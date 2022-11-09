import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Column :");
        int column = sc.nextInt()-1;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i][column];
        }
        System.out.println("sum values in column "+column+" is: "+sum);
    }
}
