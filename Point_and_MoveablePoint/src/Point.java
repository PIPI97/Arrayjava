public class Point {
    float x=2, y=3;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x,this.y};
        return arr;
    }


    public String toString(){
        return  this.x+","+this.y;
    }
}
