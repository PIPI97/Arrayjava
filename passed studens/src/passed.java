import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            do{
            System.out.print("Enter a mark for student " + (i + 1) + "st : ");
            array[i] = scanner.nextInt();
                if (array[i]>10 || array[i] <0){
                    System.out.println("mark is false");
                }
            }
            while (array[i]>10 || array[i] <0);
        }
        int count = 0;
        System.out.printf("%-20s%s","List of mark: ","");
        for (int mark: array) {
            System.out.print(mark + "\t");
            if (mark >= 5 && mark <= 10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
