public class Triagle extends Shape {
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    Triagle() {
    }

    ;

    Triagle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    ;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double per2 = getPerimeter() / 2;
        return Math.sqrt(per2 * (per2 - this.side1) * (per2 - this.side2) * (per2 - this.side3));
    }

    public boolean checkTriangle() {

        if (    this.side1 + this.side2 > this.side3 &&
                this.side2 + this.side3 > this.side1 &&
                this.side1 + this.side3 > this.side2) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return checkTriangle() ?
                super.toString() +
                        " Triangle{" +
                        "side1=" + side1 +
                        ", side2=" + side2 +
                        ", side3=" + side3 +
                        ", Area=" + getArea() +
                        ", Perimeter" + getPerimeter() +
                        '}' :
                "this is not triangle";
    }
}
