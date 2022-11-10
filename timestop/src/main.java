import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        time_stop time = new time_stop();
        time.setStart();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        time.setStop();
        System.out.println(time.getElapsedTime());

    }
}
