public class CircleResize extends Circle implements Resizeable {
    CircleResize() {

    }
    CircleResize(double radius){
        super(radius);
    }
    CircleResize(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public Circle resize(double percent) {
        return new Circle(this.getRadius() + this.getRadius() * percent / 100);
    }
}
