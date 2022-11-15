public class test {

    public static void main(String[] args) {
        Point po = new Point();
        System.out.println(po);
        MoveablePoint mv = new MoveablePoint(5, 3);
        System.out.println(mv);
        mv.move();
        System.out.println(mv.x + "," + mv.y);
    }
}

