public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);

        Circle circle = new CircleResize(3.5, "indigo", false);
        System.out.println(circle);
        CircleResize circleResize1 = (CircleResize) circle;
        System.out.println(circleResize1.resize(30));
    }
}
