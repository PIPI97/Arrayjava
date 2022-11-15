import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        time_stop time = new time_stop();
        time.setStart();
        Thread.sleep(10000);
        time.setStop();
        System.out.println(time.getElapsedTime());

    }
}
