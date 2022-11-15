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

    public static void main(String[] args) {

        Circle Circle1 = new Circle();
//        Circle1.setRadius(3);
//        Circle1.setColor("yellow");

        System.out.println(Circle1.toString());
        Cylinder Cylinder1 = new Cylinder(3, 6, "blue");
        System.out.println(Cylinder1);
    }
}
