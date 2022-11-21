public class ArrayShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2,5);
        shapes[2] = new Square(2);
        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Square) {
                Square sq1 = (Square) shape;
                System.out.println(sq1.howToColor());
            }
        }
    }
}