import java.util.Scanner;

public class deletavalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Old array: ");
        int[] oldarray = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[oldarray.length - 1];
        boolean check = false;
        int deindex;
        for (int n : oldarray) {
            System.out.print(n + "\t");
        }
        do {
            System.out.println("\nEnter value to delete : ");
            int num = sc.nextInt();
            for (int i = 0; i < oldarray.length; i++) {
                if (oldarray[i] == num) {
                    deindex = i;
                    for (int j = 0; j < deindex; j++) {
                        newarray[j] = oldarray[j];
                    }
                    for (int j = deindex; j < newarray.length; j++) {
                        newarray[j] = oldarray[j + 1];
                    }
                    System.out.println("New array: ");
                    for (int n : newarray) {
                        System.out.print(n + "\t");
                    }
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Dont found! ");
            }
        } while (!check);
    }
}


