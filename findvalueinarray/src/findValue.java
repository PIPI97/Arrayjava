import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {
        boolean checkname = false;
        do {
            String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = sc.nextLine();
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(name)) {
                    checkname = true;
                    System.out.println("Find " + name + " in index " + (i + 1));
                    break;
                }
            }
            if (!checkname) {
                System.out.println("Not found \n");
            }
        } while (!checkname);
    }
}

