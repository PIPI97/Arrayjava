public class Cylinder extends Circle {
    double height;

    public Cylinder(double height, double radius, String color) {
        this.height = height;
        this.radius = radius;
        this.color = color;

    }

    public Cylinder() {
    }

    double getVolume() {
        return getArea() * this.height;
    }


    @Override
    public String toString() {
        return super.toString() + " height: " + this.height + ", Volume: " + getVolume();
    }
}
