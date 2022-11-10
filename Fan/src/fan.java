public class fan {
    private int speed;
    private boolean on_off;
    private double radius;
    private String color;

    public fan() {
        this.speed = 1;
        this.on_off = false;
        this.radius= 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

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

    public String toStirng() {
        if (this.on_off) {
            return "speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + ", fan is on";
        } else {
            return "color: " + this.color + ", radius: " + this.radius + ", fan is off";
        }
    }
}
