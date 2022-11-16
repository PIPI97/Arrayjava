import java.util.Scanner;

public class TriagleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = sc.nextDouble();
        System.out.println("Enter color: ");
        String color = sc.next();

//        Triagle triagle1= new Triagle();
//        System.out.println(triagle1);
        Triagle triagle2= new Triagle(side1,side2,side3,color);
        System.out.println(triagle2);
    }
}
