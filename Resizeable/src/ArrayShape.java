public class ArrayShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Square){
                Square sq1 = (Square)shape;
                System.out.println(sq1.howToColor());
            }
        }
    }
}
