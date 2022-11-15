public class Circle {
    double radius=3;
    String color= "yellow";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "radius: " + this.radius + ", Color: " + color +", Area: " + getArea();
    }

    ;
}
