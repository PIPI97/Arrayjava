import java.util.Scanner;

public class minnumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size;
            int[] numarray;
            do {
                System.out.println("Size : ");
                size = sc.nextInt();
                if (size > 20) {
                    System.out.println(size +" is too large; enter Size < 20");
                }
            } while (size > 20);
            numarray = new int[size];
            for (int i = 0; i < numarray.length; i++) {
                System.out.println("Enter num " + (i + 1) + "st");
                numarray[i] = sc.nextInt();
            }
            for (int n : numarray) {
                System.out.print(n + "\t");
            }
            int min = numarray[0];
            for (int i = 1; i < numarray.length; i++) {
                if (numarray[i] < min) {
                    min = numarray[i];
                }
            }
            System.out.println("min number is " + min);
        }
    }

