import java.util.Scanner;

public class addvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Old array: ");
        int[] oldarray = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[oldarray.length + 1];
        for (int n: oldarray) {
            System.out.print(n + "\t");
        }
        System.out.println("\nEnter value to add to array: ");
        int value = sc.nextInt();
        System.out.println("Enter index of adding value: ");
        int addindex = sc.nextInt() -1;

        for (int n : oldarray) {
            System.out.print(n + "\t");
        }
        for (int i = 0; i < addindex ; i++) {
            newarray[i] = oldarray[i];
        }

        newarray[addindex] = value;

        for (int i = addindex + 1; i < newarray.length; i++) {
            newarray[i] = oldarray[i - 1];
        }
        System.out.println("New array: ");
        for (int n : newarray) {
            System.out.print(n + "\t");
        }
    }
}




